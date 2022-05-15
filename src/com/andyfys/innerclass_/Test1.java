package com.andyfys.innerclass_;

/**
 * @author Andyfys
 * @version 1.0
 */

public class Test1 {
    public Test1(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        Test1.Inner r = t.new Inner();
        System.out.println(r.a);
    }
}
