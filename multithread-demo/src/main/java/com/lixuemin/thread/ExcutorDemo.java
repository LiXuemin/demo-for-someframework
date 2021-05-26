package com.lixuemin.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * @program: demo-for-someframework
 * @description:
 * @author: lixuemin
 * @create: 2021-05-12
 **/
public class ExcutorDemo {
    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
    }
}
