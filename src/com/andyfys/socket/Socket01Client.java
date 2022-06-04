package com.andyfys.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 */
public class Socket01Client {


    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端成功链接上服务器。。。");
        //
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello world".getBytes());
        socket.shutdownOutput();
        //
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[2048];
        int readLine = 0;
        System.out.print("服务器返回信息:");
        while ((readLine = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes , 0 ,readLine));
        }

        //
        socket.close();
        outputStream.close();
        inputStream.close();
        System.out.println("客户端关闭。。。");
    }
}
