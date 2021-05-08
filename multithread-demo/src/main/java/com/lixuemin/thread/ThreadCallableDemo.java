package com.lixuemin.thread;

import java.util.concurrent.Callable;


/**
 * @program: demo-for-someframework
 *
 * @description:
 *
 * @author: lixuemin
 *
 * @create: 2021-04-27
 **/
public class ThreadCallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        System.out.println("这是线程CCC");
        return "线程CCC";
    }
}
