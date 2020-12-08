package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject27
 * @projectName algorithm-java
 * @description: 27. 移除元素
 * @date 2020/10/14 17:37
 */
public class Subject27 {
    public int removeElement(int[] nums, int val) {
        int m = 0, i = 0;
        while (i < nums.length - m) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - m - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                m++;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        // [0,1,2,2,3,0,4,2] 2  , [3, 2, 2, 3] 3 ,[2] 3
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        Subject27 subject27 = new Subject27();
        System.out.println(subject27.removeElement(nums, val));
    }
}
