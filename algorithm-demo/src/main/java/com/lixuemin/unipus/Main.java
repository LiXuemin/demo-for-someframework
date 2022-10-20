package com.lixuemin.unipus;

/**
 * @description template
 * @author: lixuemin
 * @date: 2022-10-20
 **/
public class Main {

    public static int myDeal(int[] array, int num){
        int optCount = 0;
        if(array == null || array.length == 0){
            return optCount;
        }
        int i = 0, j = array.length - 1;
        while (i < j){
            if (array[i] < array[j]){
                num  = num - array[j];
                j--;
            }else{
                num  = num - array[i];
                i++;
            }
            optCount++;
            if (num == 0){
                return optCount;
            }
        }
        return optCount;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 2, 1};
        int num = 5;
        System.out.println(myDeal(a, num));
    }
}
