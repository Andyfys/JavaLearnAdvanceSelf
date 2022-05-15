package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Car car = new Car(50);
        Car.Air air = car.new Air();
        air.flow();
        Car car2 = new Car(-20);
        Car.Air air1 = car2.new Air();
        air1.flow();

    }
}
