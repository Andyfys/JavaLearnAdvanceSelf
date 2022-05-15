package com.andyfys.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Andyfys
 * @version 1.0
 */
public class CollectionExerscise {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小黑",10));
        arrayList.add(new Dog("小白",5));
        arrayList.add(new Dog("小花",2));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=========================");
        for (Object o :arrayList) {
            System.out.println(o);
        }

    }
}
class Dog{
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}