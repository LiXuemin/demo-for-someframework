package com.lixuemin.algo.sorting;

import java.util.Arrays;


public abstract class SortTemplate {
    public static int[] sort(int[] arr, int n) {
        return new int[0];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
