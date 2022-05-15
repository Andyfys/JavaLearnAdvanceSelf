package com.andyfys.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 13; i++) {
            list.add("hello" + i);
        }
        list.add(1,"韩顺平教育");
        System.out.println("第五个元素：" + list.get(4));
        list.remove(5);
        list.set(7, "hello world");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
