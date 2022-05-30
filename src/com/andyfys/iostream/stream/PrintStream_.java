package com.andyfys.iostream.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * @author Andyfys
 * @version 1.0
 */
public class PrintStream_ {

    public static void main(String[] args) throws IOException {

        String filePath = "e:\\print01.txt";
        PrintStream printStream = System.out;
        printStream.print("hello,world");
        printStream.println();
        printStream.write("bonjo".getBytes(StandardCharsets.UTF_8));
        PrintStream printStream1 = new PrintStream(new FileOutputStream(filePath));
        printStream1.print("你好，世界");
        printStream.close();
        printStream1.close();
    }
}
