package com.andyfys.mothodabstract;

abstract public class Father {

    abstract public void job();

    public void getRunTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("Time is:  " + (end - start));
    }
}
