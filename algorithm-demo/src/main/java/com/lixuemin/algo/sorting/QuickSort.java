package com.lixuemin.algo.sorting;

import java.util.Arrays;


/**
 * 快速排序
 * 如果要排序数组中下表从pr到r之间的一组数据，我们选择p和r之间的任意一个数据作为pivot.
 * 遍历p->r，小于pivot的放在左边，大于pivot的放在右边，pivot放在中间。
 * 根据分治、递归的处理思想，可以递归排序下标p->q-1, q+1->r的数据，直到区间缩小为1.
 */
public class QuickSort {
    public static void main(String[] args) {
        final int[] ints = QuickSort.sort(SortingUtil.arr1, SortingUtil.arr1.length);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sort(int[] arr, int n) {
        if (n < 2) {
            return arr;
        }
        quickSort(arr, 0, n - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(arr, p, r);
        quickSort(arr, p, q - 1);
        quickSort(arr, q + 1, r);
    }

    private static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p, j = p;
        for (; j < r; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
