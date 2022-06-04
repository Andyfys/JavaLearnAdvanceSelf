package com.andyfys.homework;

import com.andyfys.socketcopy.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Andyfys
 * @version 1.0
 * 文件的下载
 * 服务端收到音乐名，给用户返回这个文件（byte[]）
 * 若没有这个文件则返回默认的音乐
 * 利用File，采取字符串拼接形成目录，创建文件判断文件是否存在
 * 若不存在则返回默认地址下的文件
 */
public class HomeWork03Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8001);
        System.out.println("服务器端监听8001端口。。。。");
        Socket accept = serverSocket.accept();
        byte[] bytes = new byte[1024];

        //默认的文件路径
        String defFilePath = "src\\无名.mp3";
        File def = new File(defFilePath);

        //从客户端得到音乐名
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();

        //拼接目标文件路径
        String tarFilePath = "src\\高山流水.mp3";
        File file = new File(tarFilePath);

        //判断客户端输入的文件是否存在
        OutputStream outputStream = accept.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        BufferedInputStream bufferedInputStream = null;

        //利用工具类，将文件用bufferedInputStream读取，转换成byte数组进行传输
        if ("高山流水".equals(s)) {
            bufferedInputStream =
                    new BufferedInputStream(new FileInputStream(file));
            bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        } else {
            bufferedInputStream =
                    new BufferedInputStream(new FileInputStream(def));
            bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        }

        //将文件写入过程
        bufferedOutputStream.write(bytes);
        accept.shutdownOutput();

        //释放资源
        bufferedInputStream.close();
        bufferedOutputStream.close();
        bufferedReader.close();
        accept.close();
        serverSocket.close();
        System.out.println("服务端关闭。。。");
    }
}
