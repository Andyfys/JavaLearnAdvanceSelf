package com.andyfys.iostream.stream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileInputStream_ {

    public static void main(String[] args) {

    }

    @Test
    public void fileReadMethod01() {
        File file = new File("e:\\hello.txt");
        FileInputStream fileInputStream = null;
        int readByte = 0;
        try {
            fileInputStream = new FileInputStream(file);
            while ((readByte = fileInputStream.read()) != -1) {
                System.out.print((char) readByte);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFileMethod02() {
        File file = new File("e:\\hello.txt");
        FileInputStream fileInputStream = null;
        int readLength = 0;
        byte[] bytes = new byte[5];
        try {
            fileInputStream = new FileInputStream(file);
            while ((readLength = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readLength));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
