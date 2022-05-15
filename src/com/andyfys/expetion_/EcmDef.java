package com.andyfys.expetion_;

import java.util.Scanner;

/**
 * @author Andyfys
 * @version 1.0
 */
public class EcmDef {
    public static void main(String[] args) {

        try {
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int i1 = Integer.parseInt(args[0]);
            int i2 = Integer.parseInt(args[1]);
            int i3 = new EcmDef().cal(i1, i2);
            System.out.println("结果为" + i3);
        } catch (NumberFormatException e) {
            System.out.println("数据格式不正确");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (DividedByZero e){
            System.out.println("除数不能为0");
        }


    }

    public int cal(int n1, int n2){
        try {
            return  (n1 / n2);
        } catch (Exception e) {
            throw new DividedByZero("除0");
        }
    }
}
class DividedByZero extends RuntimeException{
    public DividedByZero(String message) {
        super(message);
    }
}
