package com.andyfys.expetion_;



/**
 * @author Andyfys
 * @version 1.0
 */
public class ExcptionTest01 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        System.out.println(strings[0]);
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行");
    }
}




