package com.andyfys.iostream.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */

@SuppressWarnings({"all"})
public class FileCopy {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String oriPath = "e:\\lu.jpg";
        String tarPath = "d:\\lu.jpg";
        byte[] bytes = new byte[1024];
        int readLen = 0;
        try {
            fileInputStream = new FileInputStream(oriPath);
            fileOutputStream = new FileOutputStream(tarPath);
            while ((readLen = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, readLen);
            }
            System.out.println("拷贝成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
