package com.lixuemin.algo.sorting;

import java.util.Arrays;
import java.util.Random;


public class SortingUtil {
    public static int[] arr1 = {6, 5, 4, 3, 2, 1};

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printItem(int[] arr, int i, int j) {
        System.out.println("i=" + i + ",j=" + j + ",arr=" + Arrays.toString(arr));
    }

    static int[] genertateRandom() {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }

    static void check() {
        int[] arr1 = genertateRandom();
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        Arrays.sort(arr1);
        boolean same = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                same = false;
            }
        }
        System.out.println(same);
    }

    public static void assertOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            assert arr[i] <= arr[i + 1];
        }
    }
}
