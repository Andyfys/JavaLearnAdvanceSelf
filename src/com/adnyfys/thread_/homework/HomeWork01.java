package com.adnyfys.thread_.homework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork01 {

    public static void main(String[] args) {
        Print print = new Print();
        Demand demand = new Demand(print);
        Thread thread1 = new Thread(print);
        Thread thread2 = new Thread(demand);
        thread1.start();
        thread2.start();
    }
}

class Print implements Runnable {
    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * (100 + 1)));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

class Demand implements Runnable {
    private Print print;

    public Demand(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        while (print.isLoop()) {
            System.out.println("是否选择结束");
            Scanner scanner = new Scanner(System.in);
            char c1 = scanner.next().charAt(0);
            if (c1 == 'Q') {
                System.out.println("线程" + Thread.currentThread().getName() + "退出");
                print.setLoop(false);
            }
        }

    }
}