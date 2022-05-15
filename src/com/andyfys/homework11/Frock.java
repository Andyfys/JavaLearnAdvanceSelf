package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

}
