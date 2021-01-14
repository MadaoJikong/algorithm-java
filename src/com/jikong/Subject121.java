package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject121
 * @projectName algorithm-java
 * @description: 121. 买卖股票的最佳时机
 * @date 2021/1/13 17:58
 */
public class Subject121 {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        //dp数组，有2个状态  1个是天， 1个是持有股票和不持有股票
        //dp数组的值就是现在持有的钱数，现金数
        int[][] dp = new int[size][2];
        //初始化第一天
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < size; i++) {
            //今天没有买股票，分两种情况。目的 求出没持有股票时的现金数 最大。
            //昨天没买,今天没买。
            //昨天买了，今天卖。
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

            //今天买了。分两种情况。 目的 求出持有股票时的最大收益
            //昨天没买，今天买。
            //昨天买了，今天继续持有
            dp[i][1] = Math.max(-prices[i], dp[i - 1][1]);
        }
        //最后 最后一天卖出股票的状态 就是最大的收益
        return dp[size - 1][0];
    }

    /**
     * 低买 高卖
     *
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > max) {
                max = prices[i] - minPrice;
            }
        }
        return max;
    }

    /**
     * 暴力法  求 j>i  max(prices[j]-prices[i])
     *
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Subject121 subject121 = new Subject121();
        //5
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
//        //0
//        int[] prices = new int[]{7, 6, 4, 3, 1};
//        //1
//        int[] prices = new int[]{1, 2};
        int result = subject121.maxProfit(prices);
        System.out.println(result);
    }
}
