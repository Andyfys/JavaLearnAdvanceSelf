package com.andyfys.iostream.writer;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class FileWriter_ {

    public static void main(String[] args) {

    }

    @Test
    public void fileWriter() {
        String str = "e:\\notepad.txt";
        FileWriter fileWriter = null;
        char[] chars = {'h', 'e', 'l', 'l', 'o', 'w'};
        try {
            fileWriter = new FileWriter(str);
            fileWriter.write('A');
            fileWriter.write(chars);
            fileWriter.write(chars, 0, 2);
            fileWriter.write("welcome to 亚洲".toCharArray(), 0, 6);
            fileWriter.write("佳人们身体快乐");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
