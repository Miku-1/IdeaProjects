package com.tcpSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * tcp通信服务器端
 * */
public class tcpServer {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        ServerSocket serverSocket = new ServerSocket(8888);

        // 使用accept 获取客户端对象socket
        System.out.println("服务端已启动");
        Socket socket = serverSocket.accept();


        // 获取网络字节输入流对象
        InputStream is = socket.getInputStream();

        // 使用网络字节输入流对象中的方法 read 读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // 获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();

        // 使用网络字节输出中的write方法,给客户端回写数据
        os.write("thankyou".getBytes());

        // 释放资源(socket, seversocket)
        socket.close();
        serverSocket.close();
    }
}
