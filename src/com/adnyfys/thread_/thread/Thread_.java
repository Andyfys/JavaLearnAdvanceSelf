package com.adnyfys.thread_.thread;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Thread_ {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.start();
        Thread thread = new Thread(cat);
        thread.start();

    }
}
@SuppressWarnings({"all"})
class Cat implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("喵喵喵");
            System.out.println("Cat " + (++count));
            if(count > 10){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
class Dog extends Thread{


    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("汪汪汪" + (++count) + Thread.currentThread().getName());
            if(count > 20){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}