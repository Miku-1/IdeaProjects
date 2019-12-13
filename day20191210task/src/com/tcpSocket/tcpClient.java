package com.tcpSocket;

/*
* tcp通信客户端
* */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class tcpClient {
    public static void main(String[] args) throws IOException {
        // 创建客户端对象,绑定ip和端口
        Socket socket = new Socket("127.0.0.1",8888);

        // 获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();

        // 给服务器发数据
        os.write("hello".getBytes());

        // 获取网络字节输入流对象
        InputStream is = socket.getInputStream();

        // 读取服务器会写数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // 释放资源
        socket.close();
    }
}
