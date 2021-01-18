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
        for (int i = 0; i < n; n++) {
            sums += nums[i];
        }
        if (sums % 2 != 0) {
            return false;
        } else {
            sums = sums / 2;
        }
        // dp
        int[][] dp = new int[n][sums];
        //初始化
        //for()
        return false;
    }

    public static void main(String[] args) {
        Subject416 subject416 = new Subject416();
        //true
        int[] nums = new int[]{1, 5, 11, 5};
//        //false
//        int[] nums = new int[]{1, 2, 3, 5};
        boolean b = subject416.canPartition(nums);
        System.out.println(b);
    }
}
