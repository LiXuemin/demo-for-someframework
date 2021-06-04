package com.lixuemin.algo;

import java.util.Arrays;


/**
 * @program: demo-for-someframework
 * @description:
 * @author: lixuemin
 * @create: 2021-06-03
 **/
class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int length = nums.length;
        int i = 0;
        while (i < length - 1) {
            if (nums[i] != nums[i + 1]) {
                i++;
                continue;
            }

            for(int k = i + 1; k < length - 1; k++) {
                nums[k] = nums[k + 1];
            }
            length--;
        }
        System.out.println(length);
        System.out.println(Arrays.toString(nums));
        return length;
    }

}
