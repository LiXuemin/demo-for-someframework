package com.lixuemin.algo.java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


/**
 * @description a demo of queue
 * @author: lixuemin
 * @date: 2022-09-05
 **/
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> blockQueue = new ArrayBlockingQueue<>(1);
        blockQueue.offer(1);
        blockQueue.offer(2);
        System.out.println(blockQueue.size());


    }
}
