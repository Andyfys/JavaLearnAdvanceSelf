package com.andyfys.iostream.stream;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Andyfys
 * @version 1.0
 * 字节流既可以处理二进制文件，也可以处理文本文件！
 */
public class BufferedCopy_ {

    public static void main(String[] args) {

    }

    @Test
    public void fileCopy() throws Exception{
        String oriPath = "e:\\lu.jpg";
        String destPath = "e:\\luCopy.jpg";
        byte[] bytes = new byte[1024];
        int readLen;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(oriPath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));
        while ((readLen = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,readLen);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();


    }

}
