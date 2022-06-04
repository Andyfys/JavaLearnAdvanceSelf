package com.andyfys.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 * 使用字符流，服务端接受客户端发开的消息
 * 服务端判断，是否返回的是所规定好的问题呢，
 * 若不是，返回“你说啥呢”
 * 若是name则返回“我是 name”
 * 若是hobby则返回“编写java程序”
 */
public class HomeWork01Server {
    public static void main(String[] args) throws IOException {
        String name = "andy";
        String ans = "";
        ServerSocket serverSocket = new ServerSocket(8008);
        System.out.println("服务端正在监听8008端口。。。");
        Socket accept = serverSocket.accept();
        //读取内容
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        //根据读取到的内容进行反馈
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        if ("name".equals(s)) {
            ans = "我是" + s;
        } else if ("hobby".equals(s)) {
            ans = "编写JAVA程序";
        } else {
            ans = "你说啥呢";
        }
        bufferedWriter.write(ans);
        bufferedWriter.flush();
        accept.shutdownOutput();
        System.out.println("反馈发送成功。。");


        bufferedWriter.close();
        bufferedReader.close();
        accept.close();
        System.out.println("服务端结束。。");
    }
}
