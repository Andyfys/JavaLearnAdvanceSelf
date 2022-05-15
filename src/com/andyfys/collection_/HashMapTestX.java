package com.andyfys.collection_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HashMapTestX {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 3; i++) {
            hashMap.put(new A(i),"hhh");
        }

        for (int i = 4; i < 8; i++) {
            hashMap.put(new B(i),"hhh");
        }
        for (int i = 8; i < 10; i++) {
            hashMap.put(i,"hhh");
        }
        hashMap.put(11,"xixi");
        hashMap.put(12,"xixi");
        hashMap.put(13,"xixi");
        hashMap.put(14,"xixi");
    }
}
class A{
    private final int num;

    public A(int num) {
        this.num = num;
    }


    @Override
    public int hashCode() {
        return 100;
    }
}
class B{
    private final int num;

    public B(int num) {
        this.num = num;
    }



    @Override
    public int hashCode() {
        return 200;
    }
}