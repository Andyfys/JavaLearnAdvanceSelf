package com.andyfys.iostream.stream;

import java.io.*;

/**
 * @author Andyfys
 * @version 1.0
 */
public class OutPutStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\andy.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf8"));
        bufferedWriter.write("哈喽，世界好");
        bufferedWriter.close();

    }


}
