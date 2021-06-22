package com.lixuemin.thread;

/**
 * @program: demo-for-someframework
 *
 * @description:
 *
 * @author: lixuemin
 *
 * @create: 2021-05-08
 **/
public class FinalDemo {
    public static volatile int i;
    public static int j;

    public static void main(String[] args) throws InterruptedException {
        Runnable A = new Runnable() {
            @Override
            public void run() {
                i = 1;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread A" + i + "," + j);
                }
            }
        };
        Runnable B = new Runnable() {
            @Override
            public void run() {
                j = i;
                System.out.println("Thread B" + i + "," + j);
            }
        };

        Runnable C = new Runnable() {
            @Override
            public void run() {
                i = 2;
                System.out.println("Thread C" + i + "," + j);
            }
        };

        new Thread(A).start();
        Thread.sleep(1000);
        new Thread(B).start();
        Thread.sleep(1000);
        new Thread(C).start();
    }
}
