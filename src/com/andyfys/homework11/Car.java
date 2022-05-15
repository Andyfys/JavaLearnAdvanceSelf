package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
public class Car {
    private final double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature < 0) {
                System.out.println("吹暖气");
                return;
            }
            if (temperature > 40) {
                System.out.println("吹冷气");
                return;
            }
            System.out.println("关闭空调");
        }

    }
}

