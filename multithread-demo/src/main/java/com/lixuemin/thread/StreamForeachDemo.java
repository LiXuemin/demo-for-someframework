package com.lixuemin.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @program: demo-for-someframework
 *
 * @description:
 *
 * @author: lixuemin
 *
 * @create: 2021-05-07
 **/
public class StreamForeachDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        list.forEach(StreamForeachDemo::incr);
        System.out.println(list.toString());
    }

    private static void incr(Integer s) {
        s = s + 1;
    }
}
