package com.lixuemin.algo.sorting;

public class BubbleSort1 extends SortTemplate{

    public static int[] sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }
}
