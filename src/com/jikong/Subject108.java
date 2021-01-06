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

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = helper(nums, left, mid - 1);
        treeNode.right = helper(nums, mid + 1, right);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Subject108 subject108 = new Subject108();
        TreeNode treeNode = subject108.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
