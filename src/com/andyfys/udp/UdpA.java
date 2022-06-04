package com.andyfys.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class UdpA {
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
        System.out.println(new String(data,0,length));

        //A 的发送
        bytes = "好的，明天见".getBytes();
        datagramPacket =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("ip"), 9999);
        datagramSocket.send(datagramPacket);


        //关闭资源
        datagramSocket.close();
    }


}
