package com.jikong;

import java.util.Arrays;

/**
 * @author chengjunchao
 * @title: Subject32
 * @projectName algorithm-java
 * @description: 322. 零钱兑换
 * @date 2021/1/19 16:36
 */
public class Subject322 {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Subject322 subject322 = new Subject322();
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        int result = subject322.coinChange(coins, amount);
        System.out.println(result);
    }
}
