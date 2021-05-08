package com.lixuemin.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/**
 * @program: demo-for-someframework
 *
 * @description: 主函数
 *
 * @author: lixuemin
 *
 * @create: 2021-04-27
 **/
public class ThreadMain {
    public static void main(String[] args) {
        Thread.currentThread().getThreadGroup().list();
        System.out.println(Thread.activeCount());
        Thread.currentThread().getThreadGroup().getParent().list();
    }

    public static void main1(String[] args) {
        ThreadCallableDemo threadC = new ThreadCallableDemo();
        FutureTask<String> futureTask = new FutureTask<>(threadC);
        new Thread(futureTask).start();
        System.out.println("主线程");
        try {
            System.out.println(futureTask.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
