package com.lixuemin.algo.sorting;

public class InsertionSort1 extends SortTemplate{
    public static int[] sort(int[] arr, int n){
        if (n < 2) {
            return arr;
        }
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            for (; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
