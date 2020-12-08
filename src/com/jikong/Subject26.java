package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject26
 * @projectName algorithm-java
 * @description: 26. 删除排序数组中的重复项
 * @date 2020/10/13 13:55
 */
public class Subject26 {
    /**
     * 不需要移动元素  直接把后面的赋值给前面有重复的就行
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int p = nums.length;
        int n = 0;
        int m = 0;
        while (n < p - m) {
            if (nums[n] == nums[n + 1]) {
                for (int i = n + 1; i < p - n - 1; i++) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    m = i;
                }
            } else {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        //0, 0, 1, 1, 1, 2, 2, 3, 3, 4    1,1,2
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Subject26 subject26 = new Subject26();
        System.out.println(subject26.removeDuplicates(nums));
    }
}
