package com.adnyfys.thread_.homework;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork02 {

    public static void main(String[] args) {
        Card card = new Card();
        Thread thread1 = new Thread(card);
        Thread thread2 = new Thread(card);
        thread1.setName("A线程");
        thread2.setName("B线程");
        thread1.start();
        thread2.start();
    }

}

class Card implements Runnable {
    private  int res = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (res < 1000) {
                    System.out.println("余额不足！！");
                    break;
                }
                res -= 1000;
                System.out.println(Thread.currentThread().getName() + "取了1000\t" + "余额为：" + res);
            }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


        }
    }
}