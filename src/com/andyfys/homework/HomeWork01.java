package com.andyfys.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String fileDir = "e:\\mytemp";
        String filePath = "e:\\mytemp\\hello.txt";
        FileWriter fileWriter = null;
        File file = new File(fileDir);
        File file1 = new File(filePath);
        if (!(file.exists())) {
            file.mkdirs();
        }
        if (file1.exists()) {
            System.out.println("该文件已经存在，请不要重复创建！");
            return;
        }
        file1.createNewFile();
        System.out.println("文件" + file1.getName() + "创建成功");
        fileWriter = new FileWriter(filePath);
        fileWriter.write("hello,world~");
        fileWriter.close();
        System.out.println("文件写入成功");

    }
}

