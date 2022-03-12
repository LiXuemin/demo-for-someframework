package com.lixuemin.algo.sorting;

/**
 * 插入排序
 * 分为已排序空间和未排序空间，开始将头元素视为已排序。
 * 已排序空间中从后往前遍历，若大于待插入元素，则后移，直至插入。
 */
public class InsertionSort {
    public static void main(String[] args) {
        final int[] ints = InsertionSort.sort(SortingUtil.arr1, SortingUtil.arr1.length);
        SortingUtil.printArray(ints);
    }


    public static int[] sort(int[] arr, int n) {
        if (arr == null || n <= 1) {
            return arr;
        }
        //i界定出未排序空间
        for (int i = 1; i < n; i++) {
            //待插入元素为：取未排序空间中，第一个元素
            int temp = arr[i];
            //j界定已排序空间
            int j = i - 1;
            //已排序空间由后往前
            for (; j >= 0; j--) {
                //待插入元素依次比较，若较小则已排序空间元素后移
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    //比已排序最大的元素还大，结束本次插入过程
                    break;
                }
                SortingUtil.printItem(arr, i, j);
            }
            //j+1 <= i,要么在原来位置，要么在比其小的元素后面
            arr[j + 1] = temp;
        }
        return arr;
    }
}
