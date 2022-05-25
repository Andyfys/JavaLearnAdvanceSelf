package com.adnyfys.thread_.threadexercise;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ThreadMethodExercise01 {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        Thread thread = new Thread(new Say());
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + (++count));
            Thread.sleep(1000);
            if (count == 5) {
                thread.start();
                thread.join();
            }
        }
        System.out.println("主线程结束。。。");
    }
}
@SuppressWarnings({"all"})
class Say implements Runnable {
    private boolean loop = true;
    private int count;

    @Override
    public void run() {
        while (loop) {
            System.out.println("hello" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                System.out.println("子线程结束。。。");
                break;
            }
        }
    }
}