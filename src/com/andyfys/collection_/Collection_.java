package com.andyfys.collection_;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Andyfys
 * @version 1.0
 */
public class Collection_ {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        //iterator 迭代器方式
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        // 增强for循环方式
        for(Object obj: arrayList){
            System.out.println(obj);
        }
    }

}
