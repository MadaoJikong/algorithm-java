package com.jikong;

/**
 * @author chengjunchao
 * @title: SubjectPack01
 * @projectName algorithm-java
 * @description: 经典动态规划：0-1背包问题
 * 给你一个可装载重量为 W 的背包和 N 个物品，每个物品有重量和价值两个属性
 * @date 2021/1/15 9:51
 */
public class SubjectPack01 {
    /**
     * 0-1背包问题
     *
     * @param wt  物品重量数组
     * @param val 物品价值数组
     * @param n   物品数量
     * @param w   背包重量
     * @return 最大价值
     */
    public int pack01(int[] wt, int[] val, int n, int w) {
        //第一个状态 包的重量， 第二个状态 可选择的物品
        int[][] dp = new int[w + 1][n + 1];
        for (int i = 0; i <= w; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (i - wt[j - 1] < 0) {
                        //当物品放不到包里时 就是上次的价值
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        //不放物品的价值是多少，  放了后的价值 + 上个状态的价值
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - wt[j - 1]][j - 1] + val[j - 1]);
                    }
                }
            }
        }
        return dp[w][n];
    }

    public static void main(String[] args) {
        SubjectPack01 subjectPack01 = new SubjectPack01();
        //6
        int[] wt = new int[]{2, 1, 3};
        int[] val = new int[]{4, 2, 3};
        int n = 3;
        int w = 4;
        int result = subjectPack01.pack01(wt, val, n, w);
        System.out.println(result);
    }
}
