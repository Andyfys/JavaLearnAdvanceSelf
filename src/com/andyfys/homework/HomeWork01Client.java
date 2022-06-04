package com.andyfys.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Andyfys
 * @version 1.0
 * 负责 发送name
 *     和 hobby
 */
public class HomeWork01Client {
    public static void main(String[] args) throws IOException {
        String q1 = "name";
        String q2 = "hobby";
        String q3 = "kidding";

        Socket socket = new Socket(InetAddress.getLocalHost(),8008);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//        Scanner scanner = new Scanner(System.in);
//        String questionNum = scanner.next();
        bufferedWriter.write(q1);
        bufferedWriter.flush();
        socket.shutdownOutput();
        //接受服务器回复
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);



        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端结束。。");
    }
}
