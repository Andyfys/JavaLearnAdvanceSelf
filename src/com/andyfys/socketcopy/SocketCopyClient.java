package com.andyfys.socketcopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 */
public class SocketCopyClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //获取文件输入流，并且转成byte数组
        File file = new File("e:\\lu.jpg");
        //读取是input，
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //获取socket流，将byte数组传入socket流之中
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bytes);
        socket.shutdownOutput();
        //读取服务器端返回的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(bufferedReader.readLine());
        //关闭客户端
        bufferedReader.close();
        bufferedInputStream.close();
        socket.close();
        System.out.println("客户端关闭");
    }

}
