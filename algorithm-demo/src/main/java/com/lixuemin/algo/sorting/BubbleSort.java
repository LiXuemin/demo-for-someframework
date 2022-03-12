package com.lixuemin.algo.sorting;

import java.util.Arrays;


/**
 * 冒泡排序
 * n次循环，每次循环遍历所有相邻元素并比较大小来交换
 * 优化点： 设置是否交换的变量，没发生交换就终止
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
        //循环N次
        for (int i = 0; i < n; i++) {
            //每次从头比较相邻元素大小，进行排序
            for (int j = 0; j < n - 1; j++) {
                //比较大小，利用一个临时变量，把小的挪到前面
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    SortingUtil.printItem(arr, i, j);
                }
            }
        }
        return arr;
    }



    /**
     * 优化一下，加了个变量swapped表示本轮冒泡有没有发生数据变更
     * 如果发生，则继续下一次冒泡
     * 否则直接终止循环
     * */
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
                    SortingUtil.printItem(arr, i, j);
                    swapped = true;
                }
            }
            if (!swapped) break;

        }
        return arr;
    }


}
