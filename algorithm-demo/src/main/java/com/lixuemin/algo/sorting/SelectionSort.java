package com.lixuemin.algo.sorting;

/**
 * 选择排序
 * 类似插入排序。区别在于初始将所有看作未排序空间。
 * 每次遍历，找出最小值，与未排序空间的头元素互换位置，同时扩大已排序空间范围，直至最后结束。
 * */
public class SelectionSort {
    public static void main(String[] args) {
        final int[] ints = SelectionSort.sort(SortingUtil.arr1, SortingUtil.arr1.length);
        SortingUtil.printArray(ints);
    }

    public static int[] sort(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return arr;
        }
        int temp, min, index;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            min = arr[i];
            index = i;
            for (int j = i; j < n; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    index = j;
                    swapped = true;
                }
                SortingUtil.printItem(arr,i,j);
            }
            if (!swapped) break;
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }


    public static int[] sort1(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return arr;
        }
        int temp, min;
        for (int i = 0; i < n; i++) {
            int j = i;
            min = arr[j];
            for (; j < n - 1; j++) {
                if (min > arr[j + 1]){
                    min = j + 1;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
