package com.andyfys.mathclass_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class MathClass {
    public static void main(String[] args) {
        MathTest mathTest = new MathTest();
        mathTest.putRandom();


    }
}
class MathTest{

    public void putRandom(){
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(3 + Math.random()*(7)));
        }

    }

}