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
        // dp
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
