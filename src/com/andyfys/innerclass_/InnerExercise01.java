package com.andyfys.innerclass_;

public class InnerExercise01 {
    public static void main(String[] args) {
        new Cellphone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        new Cellphone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}

class Cellphone {
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
