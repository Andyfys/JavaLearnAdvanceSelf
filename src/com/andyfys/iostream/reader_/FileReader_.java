package com.andyfys.iostream.reader_;

import org.junit.jupiter.api.Test;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 利用单个字符来进行读取
     */
    @Test
    public void readFile01() {
        FileReader fileReader = null;
        int data = 0;
        String filePath = "e:\\story.txt";
        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Test
    public void fileRead02() {
        FileReader fileReader = null;
        int readLen = 0;
        char[] chars = new char[512];
        String filePath = "e:\\story.txt";
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
