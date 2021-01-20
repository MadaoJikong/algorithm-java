package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject518
 * @projectName algorithm-java
 * @description: 518. 零钱兑换 II
 * @date 2021/1/20 15:57
 */
public class Subject518 {
    public int change(int amount, int[] coins) {
        if (coins.length == 0) {
            return 0;
        }
        //两个状态，使用几个coins，凑多少钱。coins 前几个，可以凑够 多少钱。能有dp[i][j] 个方式
        int[][] dp = new int[coins.length + 1][amount + 1];

        return 1;
    }

    public static void main(String[] args) {
        Subject518 subject518 = new Subject518();
        //输出4
        int amount = 5;
        int[] coins = {1, 2, 5};
        int result = subject518.change(amount, coins);
        System.out.println(result);
    }
}
