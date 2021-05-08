package com.lixuemin.thread;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * @program: demo-for-someframework
 *
 * @description: 非线程安全计数器
 *
 * @author: lixuemin
 *
 * @create: 2021-04-28
 **/
public class Counter {
    private  int sum = 0;
    public void increment() {
        sum++;
    }
    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        int loop = 10000;
        Counter counter = new Counter();
        for (int i = 0; i < loop; i++) {
            counter.increment();
        }
        System.out.println("single thread result: " + counter.getSum());

        final Counter counter1 = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < loop / 2; i++) {
                counter1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < loop / 2; i++) {
                counter1.increment();
            }
        });
        t1.start();
        t2.start();
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("multiThread result: " + counter1.getSum());

    }
}
