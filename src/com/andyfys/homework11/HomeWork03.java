package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        //父类的引用指向子类的对象
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
