package com.andyfys.collection_.homework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        arrayList.add(car);
        arrayList.add(car2);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o :arrayList) {
            System.out.println(o);
        }

        System.out.println("arrayList=" + arrayList);
        arrayList.remove(car);
        System.out.println("arrayList=" + arrayList);
        System.out.println("arrayList.size =" + arrayList.size());
        System.out.println("arrayList.isEmpty =" + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("arrayList.isEmpty =" + arrayList.isEmpty());
        Vector vector = new Vector();
        Car car3 = new Car("宝马", 400000);
        Car car4 = new Car("宾利", 5000000);
        vector.add(car3);
        vector.add(car4);
        arrayList.addAll(vector);
        System.out.println(arrayList.containsAll(vector));
        System.out.println("sin arrayList =" + arrayList);
        arrayList.removeAll(vector);
        System.out.println("sin arrayList.isEmpty =" + arrayList.isEmpty());

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}