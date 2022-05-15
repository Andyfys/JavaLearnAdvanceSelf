package com.andyfys.homework11.xiyou;

import com.andyfys.homework11.xiyou.Boat;
import com.andyfys.homework11.xiyou.Horse;
import com.andyfys.homework11.xiyou.Plane;

/**
 * @author Andyfys
 * @version 1.0
 */
public class TrafficFactory {
    private static final Horse horse = new Horse();

    private TrafficFactory() {
    }

    public static Boat getBoat(){
        return new Boat();
    }
    public static Horse getHouse(){
        return horse;
    }
    public static Plane getPlane(){
        return new Plane();
    }

}
