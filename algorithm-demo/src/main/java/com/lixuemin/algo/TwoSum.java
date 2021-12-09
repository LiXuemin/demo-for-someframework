package com.lixuemin.algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 *
 **/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        twoSum(new int[]{3,2,4}, 6);
        Arrays.sort(nums);
        System.out.println(nums.toString());
    }
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[]{0, 1};
        }
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        int i = 0;
        for(int n : nums) {
            if(map.containsKey(target - n)){
                return new int[]{map.get(target - n), i};
            }else {
                map.put(target - n, i);
            }
            i++;
        }
        return new int[]{0, 0};

    }
}
