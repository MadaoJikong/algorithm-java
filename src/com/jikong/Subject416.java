package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject416
 * @projectName algorithm-java
 * @description: 416.分割等和子集（中等）
 * @date 2021/1/15 17:51
 */
public class Subject416 {
    boolean canPartition(int[] nums) {
        //可以搞成背包问题。数组的sum 平分，凑够
        int n = nums.length;
        int sums = 0;
        for (int i = 0; i < n; i++) {
            sums += nums[i];
        }
        if (sums % 2 != 0) {
            return false;
        } else {
            sums = sums / 2;
        }
        // dp 有两个状态 值是放和不放  状态1： n是数组大小， 状态2：sums是一半
        boolean[][] dp = new boolean[n + 1][sums + 1];
        //初始化
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        //状态转移
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sums; j++) {
                //判断能不能放下
                if (j - nums[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n - 1][sums];
    }

    public static void main(String[] args) {
        Subject416 subject416 = new Subject416();
//        //true
//        int[] nums = new int[]{1, 5, 11, 5};
        //false
        int[] nums = new int[]{2, 2, 3, 5};
        boolean b = subject416.canPartition(nums);
        System.out.println(b);
    }
}
