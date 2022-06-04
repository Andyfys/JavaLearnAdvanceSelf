package com.andyfys.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 */
public class Socket01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器监听9999端口，等待链接。。。");
        Socket accept = serverSocket.accept();
        //
        InputStream inputStream = accept.getInputStream();
        System.out.println("连接成功。。。。");
        //
        byte[] bytes = new byte[2048];
        int readLine = 0;
        while ((readLine = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes , 0 ,readLine));
        }
        //
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello client".getBytes());
        accept.shutdownOutput();
        //
        inputStream.close();
        accept.close();
        serverSocket.close();
        outputStream.close();
        System.out.println("服务器关闭。。。。");

    }
}
