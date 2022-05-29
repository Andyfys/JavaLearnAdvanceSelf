package com.andyfys.iostream.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ObjectInputStream_ {

    public static void main(String[] args) {
        String filePath = "e:\\data.dat";
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readUTF());
            System.out.println(objectInputStream.readObject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
