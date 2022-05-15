package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */

public enum Color implements ShowColor {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }




    @Override
    public void show() {
        System.out.println(redValue + " " +  greenValue + " " + blueValue);

    }
}

interface ShowColor {
    void show();
}
