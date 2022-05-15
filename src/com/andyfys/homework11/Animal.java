package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */

 abstract public class Animal {
     abstract public void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
