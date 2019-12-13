package com.fileUpLoad;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 服务器端
* */
public class tcpServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器对象 并指定端口
        ServerSocket server = new ServerSocket(8888);

        // 调用accept方法  获取请求客户端的对象
        Socket socket = server.accept();


        // 输入流的对象
        InputStream is = socket.getInputStream();

        // 保存地址(判断是否存在)
        File file = new File("E:\\file");
        if (!file.exists()){
            file.mkdirs();
        }

        // 输出流的对象
        FileOutputStream fos = new FileOutputStream(file+"\\test.png");

        // 读取上传的文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            // 写入磁盘
            fos.write(bytes, 0, len);
        }

        // 给客户端反馈信息
        socket.getOutputStream().write("上传成功".getBytes());

        // 释放资源
        fos.close();
        socket.close();
        server.close();
    }
}
