package com.andyfys.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Socket03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器监听9999端口，等待链接。。。");
        Socket accept = serverSocket.accept();
        System.out.println("连接成功。。。。");
        //
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //
        String  readLine = "";
        readLine = bufferedReader.readLine();
        System.out.println(readLine);
        //
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        //accept.shutdownOutput();

        //
        bufferedReader.close();
        bufferedWriter.close();
        accept.close();
        serverSocket.close();
        System.out.println("服务器关闭。。。。");

    }
}
