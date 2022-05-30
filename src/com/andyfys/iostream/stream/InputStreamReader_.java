package com.andyfys.iostream.stream;

import java.io.*;

/**
 * @author Andyfys
 * @version 1.0
 */
public class InputStreamReader_ {


    public static void main(String[] args) throws IOException {
        String filePath = "e:\\andy.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        System.out.println(bufferedReader.readLine());

        bufferedReader.close();


    }
}
