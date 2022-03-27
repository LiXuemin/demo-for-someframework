package com.lixuemin.algo.sorting;

public class SelectionSort1 extends SortTemplate{
    public static int[] sort(int[] arr, int n){
        if (n < 2) {
            return arr;
        }
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int j = i + 1;
        }
        return arr;
    }
}
