package com.andyfys.iostream.buffered_;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author Andyfys
 * @version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) {

    }
    @Test
    public void fileCopy() throws Exception {
        String oriFilePath = "e://story.txt";
        String desFilePath = "e://storyCopy.txt";
        String readLin;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(oriFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(desFilePath));
        while((readLin = bufferedReader.readLine()) != null){
            bufferedWriter.newLine();
            bufferedWriter.write(readLin);
        }
        bufferedWriter.close();
        bufferedReader.close();

    }


}
