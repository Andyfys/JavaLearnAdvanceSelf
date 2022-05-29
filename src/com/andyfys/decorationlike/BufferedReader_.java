package com.andyfys.decorationlike;

/**
 * @author Andyfys
 * @version 1.0
 */
public class BufferedReader_ {
    private Reader_ in;

    public BufferedReader_(Reader_ in) {
        this.in = in;
    }

    public void readFiles(){
        for (int i = 0; i < 10; i++) {
            in.readFile();
        }
    }
    public void readCharArrays(){
        for (int i = 0; i < 10; i++) {
            in.readCharArray();
        }
    }
}
