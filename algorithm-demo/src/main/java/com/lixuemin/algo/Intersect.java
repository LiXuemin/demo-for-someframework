package com.lixuemin.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 **/
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>(Math.min(nums1.length, nums2.length));
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                i++;
            }else if (nums1[i] > nums2[j]) {
                j++;
            }else if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;j++;
            }
        }
        final int[] ints = new int[list.size()];
        return list.stream().mapToInt(i -> i).toArray();
    }
}
