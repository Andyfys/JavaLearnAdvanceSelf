package com.andyfys.collection_.homework;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedHashSetExercise01 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("大众", 330));
        linkedHashSet.add(new Car("大众", 330));
        System.out.println("LinkedHashSet=" + linkedHashSet);
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car cat = (Car) o;
        return Double.compare(cat.price, price) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}