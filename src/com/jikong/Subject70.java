package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject70
 * @projectName algorithm-java
 * @description: 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * <p>
 * 解题：
 * 本质上就是斐波那契数列的一个现实例子，从第三阶楼梯来举例：当你爬上一阶楼梯后，剩下还有两阶楼梯也就等于现在走两阶楼梯的可能，也就是2，如果是爬上两阶楼梯，就剩下一阶楼梯，也就是还有一种可能，所以f(3) = f(2) + f(1)
 * 第四阶：当爬上一阶楼梯后还剩下三阶楼梯，也就是现在有f(3)种可能，当你爬上两阶楼梯后，还有f(2)种可能，所以f(4) = f(3) + f(2)
 * 第五阶：当爬上一阶楼梯后还剩下四阶楼梯，也就是还有f(4)种可能，当你爬上两阶楼梯后，还有f(3)种可能，所以f(5) = f(4) + f(3)
 * ... ...以此类推
 * 得出结论：f(n) = f(n -1) + f(n -2) (n > 2)
 * f(n) = f(n -1) + f(n -2) (n > 2)    就是状态转移方程
 * @date 2021/1/13 14:42
 */
public class Subject70 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Subject70 subject70 = new Subject70();
        int n = 20;
        int result = subject70.climbStairs(n);
        System.out.println(result);
    }
}
