package com.andyfys.iostream.writer;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class BufferedWriter_ {

    public static void main(String[] args) {

    }


    @Test
    public void writeFile() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("e:\\andy.txt", true));

        for (int i = 0; i < 3; i++) {
            bufferedWriter.newLine();
            bufferedWriter.write("你好！世界！！" + i);
        }

        bufferedWriter.close();
    }

}
