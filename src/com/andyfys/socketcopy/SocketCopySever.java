package com.andyfys.socketcopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SocketCopySever {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器监听8888端口。。。");
        Socket accept = serverSocket.accept();

        //从socket流中获得了输入字节流，通过工具类下提供的方法来获取byte数组
        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        System.out.println("图片读取成功。。。");

        //通过bufferedInputStream()来向指定的额目录进行文件的写入
        File file = new File("src\\SocketCopy.jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(bytes);
        System.out.println("图片成功写入。。。");

        //得到图片后，向client端发送“收到图片”
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();
        bufferedWriter.newLine();

        //关闭服务器端
        bufferedWriter.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        accept.close();
    }

}
