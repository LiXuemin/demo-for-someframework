package com.lixuemin.algo.dp;

/**
 * @description 动态规划背包问题
 * @author: lixuemin
 * @date: 2022-10-18
 **/
public class DPBag {

    /**
     * 对于一组不同重量、不可分割的物品，我们需要选择一些装入背包，在满足背包最大重量限制的前提下，背包中物品总重量的最大值是多少呢？
     * 我们假设背包的最大承载重量是 9。我们有 5 个不同的物品，每个物品的重量分别是 2，2，4，6，3。
     *
     * 极客时间版权所有: https://time.geekbang.org/column/article/74788
     * */

    /**
     * @param weight 物品重量
     * @param n 物品个数
     * @param w 背包可承载重量
     * */
    public int knapsack(int[] weight, int n, int w) {
        boolean[][] states = new boolean[n][w + 1]; //默认值false
        states[0][0] = true; //?
        if (weight[0] <= w) {
            states[0][weight[0]] = true;
        }
        for (int i = 1; i < n; i++) {//动态规划状态转移
            for (int j = 0; j <= w; j++) {//不把第i个物品放入背包
                if (states[i - 1][j]) {
                    states[i][j] = states[i - 1][j];
                }
            }
            for (int j = 0; j <= w-weight[i]; j++) { //把第i个物品放入背包
                if (states[i - 1][j]) {
                    states[i][j + weight[i]] = true;
                }
            }
        }
        for (int i = w; i >= 0; i--) {
            if (states[n - 1][i]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
