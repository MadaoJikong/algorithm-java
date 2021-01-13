package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject198
 * @projectName algorithm-java
 * @description: 198. 打家劫舍
 * 最优子结构是 前k个房子， f(k)表示 k个房子最大值，  Hk 表示第k个价钱
 * 第k个 最大收益是，  f(k)=max( f(k-2)+Hk , f(k-1) )
 * @date 2021/1/13 15:40
 */
public class Subject198 {
    public int rob(int[] nums) {
        //最优子结构  dp   0，1，2，k-2，k-1，k，n-2，n-1，n
        // 子问题：
        // f(k) = 偷 [0..k) 房间中的最大金额

        // f(0) = 0
        // f(1) = nums[0]
        //状态转移方程
        // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[nums.length];
    }

    public static void main(String[] args) {
        Subject198 subject198 = new Subject198();
//        //12
//        int[] nums = new int[]{2, 7, 9, 3, 1};
        //4
        int[] nums = new int[]{1, 2, 3, 1};
        int result = subject198.rob(nums);
        System.out.println(result);
    }
}
