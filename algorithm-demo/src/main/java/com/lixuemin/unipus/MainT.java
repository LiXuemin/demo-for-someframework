package com.lixuemin.unipus;

/**
 * @description template
 * @author: lixuemin
 * @date: 2022-10-20
 **/
public class MainT {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String arrStr = in.nextLine();

        int k = in.nextInt();
        String[] arrIn = arrStr.split(" ");
        int[] arr = new int[arrIn.length];
        for (int i = 0; i < arrIn.length; i++) {
            arr[i] = Integer.valueOf(arrIn[i]);
        }
    }
}
