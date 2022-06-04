package com.andyfys.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Andyfys
 * @version 1.0
 */
public class UdpHomeWork02Receiver {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket 用来创建Udp
        DatagramSocket datagramSocket = new DatagramSocket(9998);

        //创建一个DatagramPackage用于接收
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);

        //当B接收到package时会将器封装到DatagramPacket对象中
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        //A 的发送
        if("四大名著有哪些".equals(s)){
            bytes = "四大名著是《西游记》，《三国演义》，《红楼梦》，《水浒传》".getBytes();
        } else {
            bytes = "what?".getBytes();
        }

        datagramPacket =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.5"), 9999);
        datagramSocket.send(datagramPacket);


        //关闭资源
        datagramSocket.close();
    }


}
