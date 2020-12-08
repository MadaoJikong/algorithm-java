package com.jikong;

/**
 * @author chengjunchao
 * @title: MaxProfit
 * @projectName algorithm-java
 * @description: 122、 买卖股票的最佳时机 II
 * @date 2020/10/9 17:13
 */
public class Subject122 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int size = prices.length;
        for (int i = 0; i < size - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }

    /**
     * 暴力法
     *
     * @param prices
     * @param d
     * @return [7, 1, 5, 3, 6, 4]
     */
    public int calculate(int[] prices, int d) {
        int max = 0;
        for (int start = d; start < prices.length; start++) {
            int maxProfit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int price = prices[i] - prices[start] + calculate(prices, i + 1);
                    if (price > maxProfit) {
                        maxProfit = price;
                    }
                }
            }
            if (maxProfit > max) {
                max = maxProfit;
            }
        }
        return max;
    }

    public int maxProfit1(int[] prices) {
        return calculate(prices, 0);
    }


    public static void main(String[] args) {
        // [7,1,5,3,6,4]
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Subject122 maxProfit = new Subject122();
        //波峰
        //System.out.println(maxProfit.maxProfit(prices));
        //暴力法
        System.out.println(maxProfit.maxProfit1(prices));
    }
}
