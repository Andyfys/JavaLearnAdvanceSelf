package com.andyfys.iostream.reader_;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class BufferedReader_ {

    public static void main(String[] args) {

    }

    @Test
    public void bufferedStream() {
        String filePath = "e:\\story.txt";
        BufferedReader bufferedReader = null;
        String len;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((len = bufferedReader.readLine()) != null) {
                System.out.println(len);
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
