package com.lixuemin.collection;

import java.util.Arrays;
import java.util.List;


public class TestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        for (String s : list) {
            String t = s;
        }
        String k = null;
        for (String s : list) {
            k = s;
        }
    }
}
