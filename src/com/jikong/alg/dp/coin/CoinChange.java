package com.jikong.alg.dp.coin;

/**
 * @author chengjunchao
 * @title: CoinChange
 * @projectName algorithm-java
 * @description: 凑零钱
 * @date 2020/12/15 10:30
 */
public class CoinChange {
    int coinChange(int[] coins, int amount) {
        return dp(amount, coins);
    }

    int dp(int amount, int[] coins) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        for (int i : coins) {
            //int
        }
        return 1;
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = new int[]{1, 2, 5};
        coinChange.coinChange(coins, 11);
    }
}
