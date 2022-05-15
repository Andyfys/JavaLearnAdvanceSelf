package com.andyfys.homework11.xiyou;


/**
 * @author Andyfys
 * @version 1.0
 */
public class Person {
    private final String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = TrafficFactory.getBoat();
        }
        vehicles.work();

    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            vehicles = TrafficFactory.getHouse();
        }
        vehicles.work();

    }
    public void passFireMountain() {
        if (!(vehicles instanceof Plane)) {
            vehicles = TrafficFactory.getPlane();
        }
        vehicles.work();

    }
}
