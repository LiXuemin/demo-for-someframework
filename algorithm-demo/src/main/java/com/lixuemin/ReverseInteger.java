package com.lixuemin;

import java.util.stream.Stream;


/**
 * @description 翻转int
 * @author: lixuemin
 * @date: 2022-09-14
 **/
public class ReverseInteger {
    public static final int SOURCE = 12345;
    public static void main(String[] args) {
        String s = String.valueOf(SOURCE);
        new StringBuilder(String.valueOf(SOURCE)).reverse().toString();
        System.out.println(String.valueOf(Integer.MAX_VALUE));

        
    }
}
