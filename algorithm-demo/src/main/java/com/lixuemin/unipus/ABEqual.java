package com.lixuemin.unipus;

/**
 * @description ab相等
 * @author: lixuemin
 * @date: 2022-10-20
 **/
public class ABEqual {
    public static void main(String[] args) {
        int[] a1 = {1, 0, 1};
        int[] b1 = {0, 0, 1};

        int[] a2 = {1,1,0,0};
        int[] b2 = {0, 1,1,1};

        int[] a3 = {1,1};
        int[] b3 = {1,1};

        int[] a4 = {0, 1, 1, 0};
        int[] b4 = {1, 0, 0, 1};

        int[] a5 = {1};
        int[] b5 = {0};
        abequal(a1, b1);
        abequal(a2, b2);
        abequal(a3, b3);
        abequal(a4, b4);
        abequal(a5, b5);
    }

    private static void abequal(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println(-1);
            return;
        }
        int diff1 = 0, diff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                diff++;
            }
            if (a[i] == 1) {
                diff1++;
            }
            if (b[i] == 1) {
                diff1--;
            }
        }
        if (diff1 == 0 && diff == 0) {
            System.out.println(0);
        } else if (diff1 == 0 && diff > 0) {
            System.out.println(1);
        } else if (diff1 != 0) {
            System.out.println(diff - Math.abs(diff1));
        }
    }
}
