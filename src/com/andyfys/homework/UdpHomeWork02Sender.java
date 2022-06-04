package com.andyfys.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Andyfys
 * @version 1.0
 * UDP相互之间的传输是有顺序的，即若顺序不对，则会产生阻塞，这点要注意
 */
public class UdpHomeWork02Sender {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket 用来创建Udp
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        // B的发送
        //        Scanner scanner = new Scanner(System.in);
//        String questionNum = scanner.next();
        byte[] bytes1 = "四大名著有哪些".getBytes();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("192.168.1.5"), 9998);
        datagramSocket.send(datagramPacket1);
//        //创建一个DatagramPackage用于接收
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
        //当B接收到package时会将器封装到DatagramPacket对象中
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data,0,length));



        //关闭资源
        datagramSocket.close();


    }



}
