package com.andyfys.inet_;

import java.net.InetAddress;

/**
 * @author Andyfys
 * @version 1.0
 */
public class Inet_ {
    public static void main(String[] args) throws Exception{

        InetAddress localHost1 = null;
        localHost1 = InetAddress.getLocalHost();
        System.out.println(localHost1);
        System.out.println("====================");
        InetAddress byName = InetAddress.getByName("DESKTOP-CI9Q5NR");
        System.out.println(byName);
        System.out.println("====================");
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);
        System.out.println("====================");
        String hostAddress = byName1.getHostAddress();
        System.out.println(hostAddress);
        System.out.println("====================");
        String hostName = byName1.getHostName();
        System.out.println(hostName);
    }


}
