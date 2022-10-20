package com.lixuemin.unipus;

/**
 * @description 减到 0 为止
 * @author: lixuemin
 * @date: 2022-10-20
 **/
public class MinusUntil0 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 3};
        int[] arr1 = {3, 2, 4, 1, 1};
        int[] arr2 = {3, 4, 1, 2, 1};
        int target = 5;
        minusUntil0(arr, target);
        minusUntil0(arr1, target);
        minusUntil0(arr2, target);
    }

    private static void minusUntil0(int[] arr, int target) {
        //check arr
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum == target) {
            System.out.println(arr.length);
            return;
        }
        int l = 0, r = 0, ans = -1, currentSum = 0, x = sum - target;
        for (; r < arr.length; r++) {
            currentSum += arr[r];
            if (currentSum == x) {
                ans = Math.max(ans, arr.length - (r - l + 1));
                continue;
            }
            while (l <= r && currentSum > x) {
                currentSum -= arr[l++];
            }
        }
        System.out.println(ans);
    }
}
