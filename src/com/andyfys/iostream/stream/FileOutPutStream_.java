package com.andyfys.iostream.stream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Andyfys
 * @version 1.0
 */
public class FileOutPutStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileWrite() {
        FileOutputStream fileOutPutStream = null;
        String str = "e:\\andy.txt";
        String name = "andyfys";
        try {
            fileOutPutStream = new FileOutputStream(str, true);
            //fileOutPutStream.write('h');
            //fileOutPutStream.write(name.getBytes(StandardCharsets.UTF_8));
            fileOutPutStream.write(name.getBytes(), 0, name.length());
            System.out.println("写入成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutPutStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
