package com.lixuemin.thread;

/**
 * @program: demo-for-someframework
 *
 * @description:
 *
 * @author: lixuemin
 *
 * @create: 2021-04-26
 **/
public class ThreadDemo001 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread t = Thread.currentThread();
                System.out.println("当前线程：" + t.getName());
            }
        };

        Thread thread = new Thread(task);
//        thread.setName("test-thread-1");
//        thread.setDaemon(true);
        thread.start();
    }
}
