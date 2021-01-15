package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject303
 * @projectName algorithm-java
 * @description: 303. 区域和检索 - 数组不可变
 * @date 2021/1/14 18:01
 */
public class Subject303 {
    public class NumArray {
        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            if (nums.length == 0) {
                return 0;
            }
            int sum = 0;
            for (; i <= j; i++) {
                sum += nums[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Subject303 subject303 = new Subject303();
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray n = subject303.new NumArray(nums);
        int a1 = n.sumRange(0, 2);
        int a2 = n.sumRange(2, 5);
        int a3 = n.sumRange(0, 5);
        System.out.println();
    }
}
