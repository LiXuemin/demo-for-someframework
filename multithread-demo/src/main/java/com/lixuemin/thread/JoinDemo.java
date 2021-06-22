package com.lixuemin.thread;

/**
 * @program: demo-for-someframework
 *
 * @description:
 *
 * @author: lixuemin
 *
 * @create: 2021-04-27
 **/
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Runnable() {

            public void run() {
                try {
//                    Thread.sleep(1000);
                    this.wait(1000);
                    System.out.println("当前线程：" + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
//        thread.join();

//        thread.interrupt();
//        Thread.currentThread().join(1000);
//        Thread.sleep(1000);
        System.out.println("当前主线程11111：" + Thread.currentThread().getName());
    }
}
