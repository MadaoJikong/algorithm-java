package com.jikong;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengjunchao
 * @title: Subject1
 * @projectName algorithm-java
 * @description: 1、两数之和
 * @date 2020/10/10 11:04
 */
public class Subject1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean b = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    b = true;
                    break;
                }
            }
            if (b) {
                break;
            }
        }
        return result;
    }

    /**
     * 哈希法
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length * 3);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Subject1 subject1 = new Subject1();
        int[] result = subject1.twoSum1(nums, target);
        System.out.println(result[0] + "   " + result[1]);
    }
}
