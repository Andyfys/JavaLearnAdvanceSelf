package com.andyfys.collection_;

import java.util.HashMap;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HashMapTestX {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 3; i++) {
            hashMap.put(i,"hhh");
        }

        for (int i = 0; i < 3; i++) {
            hashMap.put(i,"hhh");
        }
    }
}
class A{
    private final int num;

    public A(int num) {
        this.num = num;
    }

}
class B{
    private final int num;

    public B(int num) {
        this.num = num;
    }
}