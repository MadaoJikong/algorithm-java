package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject108
 * @projectName algorithm-java
 * @description: 108. 将有序数组转换为二叉搜索树
 * @date 2021/1/5 16:46
 */
public class Subject108 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Subject108 subject108 = new Subject108();
        TreeNode treeNode = subject108.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
