package com.andyfys.homework;

import com.andyfys.socketcopy.StreamUtils;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Andyfys
 * @version 1.0
 * 可以输入一个音乐文件名
 * 接收到服务端返回的数据保存在 e:\\ 下面
 */
public class HomeWork03Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8001);
        byte[] bytes = new byte[1024];

        //从键盘获取歌曲名称
        System.out.print("请输入歌曲名：");
        Scanner scanner = new Scanner(System.in);
        String songName = scanner.next();
        OutputStream outputStream = socket.getOutputStream();

        //写入歌曲名字给服务端
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(songName);
        //字符流out必要处理,这里一定不要忘记或者多写shutdownOutput（）
        //                  谨防堵塞
        bufferedWriter.flush();
        socket.shutdownOutput();

        //从服务器端获取的byte数组
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //向指定目录写入
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e:\\" + songName + ".mp3"));
        bufferedOutputStream.write(bytes);
        System.out.println("歌曲成功写入。。。");


        //
        bufferedOutputStream.close();
        bufferedInputStream.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端关闭。。。");
    }
}
