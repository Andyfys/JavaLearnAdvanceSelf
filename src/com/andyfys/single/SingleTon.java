package com.andyfys.single;

public class SingleTon {
    public static void main(String[] args) {


        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Dog instance1 = Dog.getInstance();
        System.out.println(instance1);

    }


}

class Cat {
    //懒汉式单例模式

    private final String name;
    private static int age;
    private static Cat cat;

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小咪");
        }
        return cat;
    }


    private Cat(String name) {
        System.out.println("懒汉式Cat类无参构造器被调用。。。");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Dog {
    //单例模式——————饿汉式

    private final String name;
    private static int age;
    private static final Dog dog = new Dog("板凳");

    public static Dog getInstance() {
        return dog;
    }

    private Dog(String name) {
        System.out.println("饿汉式Dog无参构造器被调用。。。");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}