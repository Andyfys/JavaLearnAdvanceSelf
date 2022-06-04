package com.andyfys.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Socket03Client {


    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端成功链接上服务器。。。");
        //
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        //使用newLine()来创造结束标识符的时候，读取也一要用readLine()来读取
        bufferedWriter.newLine();
        //使用字符流这里一定要手动刷新
        bufferedWriter.flush();
        //socket.shutdownOutput();

        //
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String  readLine = "";
        System.out.print("服务器返回信息:");
        readLine = bufferedReader.readLine();
        System.out.println(readLine);

        //
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端关闭。。。");
    }
}
