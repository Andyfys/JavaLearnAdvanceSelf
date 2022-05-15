package com.andyfys.mothodabstract;

public class Son1 extends Father{
    private String name;
    public void job(){
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum *= i;
        }
    }

}
