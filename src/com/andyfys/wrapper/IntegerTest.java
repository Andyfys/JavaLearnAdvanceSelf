package com.andyfys.wrapper;

/**
 * @author Andyfys
 * @version 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
//        //手动装箱
//        int n1 = 10;
//        Integer integer = new Integer(n1);
//        //手动拆箱
//        int n2 = integer.intValue();
//        //自动装箱
//        int n3 = 300;
//        Integer integer1 = n3;
//        //自动拆箱
//        int n4 = integer1;

        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);
        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }

}
