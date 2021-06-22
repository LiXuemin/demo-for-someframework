package com.lixuemin.thread;

/**
 * @program: demo-for-someframework
 *
 * @description:
 *
 * @author: lixuemin
 *
 * @create: 2021-04-28
 **/
public class VolatileDemo {
    private static volatile int x = 1;

    public static void main(String[] args) {
        System.out.println(1 ^ 5 ^ 5);
    }

    public static void main1(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                x = i;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(x);
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(2000);
    }
}
