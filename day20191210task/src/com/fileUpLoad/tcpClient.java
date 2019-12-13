package com.fileUpLoad;


import java.io.*;
import java.net.Socket;

/*
 * 客户端
 * */
public class tcpClient {
    public static void main(String[] args) throws IOException {
        // 拿到上传数据
        FileInputStream file = new FileInputStream("E:\\18149342.png");

        // 创建客户端
        Socket socket = new Socket("127.0.0.1", 8888);

        // 输出流对象
        OutputStream os = socket.getOutputStream();

        // 读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = file.read(bytes)) != -1) {
            // 上传到服务器
            os.write(bytes, 0, len);
        }
        // 解决阻塞
        socket.shutdownOutput();

        // 获取服务器返回的反馈消息
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        // 释放资源
        file.close();
        socket.close();
    }
}
