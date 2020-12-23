package com.jikong.alg.dfs.permutations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chengjunchao
 * @title: Test
 * @projectName algorithm-java
 * @description: 练习
 * @date 2020/12/21 11:12
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Test t = new Test();
        List<List<Integer>> list = t.permute(nums);
        System.out.println(list);
    }

    List<List<Integer>> res = new ArrayList<>();

    List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        f(nums, track);
        return res;
    }

    //track 是路径，当路径满了后，说明没有可选择的了
    private void f(int[] nums, LinkedList<Integer> track) {
        //满了，就停止递归
        if (track.size() == nums.length) {
            res.add(new ArrayList<>(track));
            return;
        }
        for (int i : nums) {
            if (track.contains(i)) {
                continue;
            }
            track.add(i);
            f(nums, track);
            track.removeLast();
        }
    }
}
