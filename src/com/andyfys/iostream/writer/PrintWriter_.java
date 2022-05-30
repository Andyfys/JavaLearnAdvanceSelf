package com.andyfys.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Andyfys
 * @version 1.0
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(new FileWriter("e:\\print02.txt"));
        printWriter.print("我要做航空人！！");
        printWriter.close();
    }

}
