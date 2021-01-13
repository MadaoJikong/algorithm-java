package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject53
 * @projectName algorithm-java
 * @description: 53. 最大子序和
 * @date 2021/1/12 14:21
 */
public class Subject53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int res = 0;
            for (int j = i; j < nums.length; j++) {
                res += nums[j];
                max = Math.max(max, res);
            }
        }
        return max;
    }

    public int maxSubArray1(int[] num) {
        int length = num.length;
        int[] dp = new int[length];
        //边界条件
        dp[0] = num[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            //转移公式
            dp[i] = Math.max(dp[i - 1], 0) + num[i];
            //记录最大值
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Subject53 subject53 = new Subject53();
        //int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] nums = new int[]{1};
        int[] nums = new int[]{-2, 1, -3, 4};//-2 1 -2 4
        int num = subject53.maxSubArray1(nums);
        System.out.println(num);
    }
}
