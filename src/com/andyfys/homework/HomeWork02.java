package com.andyfys.homework;

import java.io.*;

/**
 * @author Andyfys
 * @version 1.0
 * 利用BufferedReader 读取一个文件 为每行添加行号 并且输出到屏幕上
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String filePath = "e:\\story.txt";
        String readLine = "";
        int lineNum = 0;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf8"));
            while ((readLine = bufferedReader.readLine()) != null) {
                System.out.println(++lineNum + "." + readLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
