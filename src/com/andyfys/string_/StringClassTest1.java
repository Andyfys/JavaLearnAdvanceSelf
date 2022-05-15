package com.andyfys.string_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class StringClassTest1 {
    public static void main(String[] args) {
        String s1 =  "8848.88";
        StringBuffer stringBuffer = new StringBuffer(s1);
        int i = stringBuffer.lastIndexOf(".");
        System.out.println(i);
    }

}
