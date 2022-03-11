package com.lixuemin.algo.sorting;

import java.util.Arrays;


/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        final int[] ints = sort2(SortingUtil.arr1, SortingUtil.arr1.length);
        SortingUtil.printArray(ints);
    }

    public static int[] sort1(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return arr;
        }

        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("i=" + i + ",j=" + j + ",arr=" + Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

    public static int[] sort2(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return arr;
        }

        int temp;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("i=" + i + ",j=" + j + ",arr=" + Arrays.toString(arr));
                    swapped = true;
                }
            }
            if (!swapped) break;

        }
        return arr;
    }
}
