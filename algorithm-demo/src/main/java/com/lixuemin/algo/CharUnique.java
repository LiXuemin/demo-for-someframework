package com.lixuemin.algo;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: demo-for-someframework
 * @description: https://leetcode-cn.com/problems/is-unique-lcci/
 * @author: lixuemin
 * @create: 2021-06-28
 **/
public class CharUnique {

    public static void main(String[] args) {
        String source = "abcccd";
        System.out.println(isUnique(source));
    }


    public static boolean isUnique(String astr) {
        if (astr == null || astr.length() == 0) {
            return true;
        }
        Set<Character> set = new HashSet<>();
        for (char c : astr.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
