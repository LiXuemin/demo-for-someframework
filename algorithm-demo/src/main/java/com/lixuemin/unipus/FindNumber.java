package com.lixuemin.unipus;

import java.util.Scanner;


/**
 * @description
 * @author: lixuemin
 * @date: 2022-10-20
 **/
public class FindNumber {
        public static void main(String[] args) {
            java.util.Scanner scan = new java.util.Scanner(System.in);
            int numsLen = scan.nextInt();
            int[] arr = new int[numsLen];
            for (int i = 0; i < numsLen; i++) {
                arr[i] = scan.nextInt();
            }
            int targetLen = scan.nextInt();
            int target = scan.nextInt();

            for (int i = 0; i < numsLen - 1; i++) {
                for (int j = 1; j < numsLen; j++) {
                    if (arr[i] + arr[j] == target){
                        System.out.println(arr[i] + " " + arr[j]);
                    }
                }
            }
        }
}
