package com.andyfys.properties_;


import java.io.*;
import java.util.Properties;

/**
 * @author Andyfys
 * @version 1.0
 */
public class Properties_ {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new InputStreamReader(new FileInputStream("src\\mysql.properties")));
        System.out.println("pwd=" + properties.getProperty("pwd"));
        Properties properties1 = new Properties();
        properties1.setProperty("user","root");
        properties1.setProperty("pwd","root");
        properties1.setProperty("IP","255,255,255,0");
        properties1.store(new FileWriter("src\\mysql2.properties"),null);
        properties1.list(System.out);
        //        properties.list(System.out);
    }
}
