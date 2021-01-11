package com.jikong;

import java.util.Stack;

/**
 * @author chengjunchao
 * @title: Subject112
 * @projectName algorithm-java
 * @description: 112. 路径总和
 * @date 2021/1/8 16:46
 */
public class Subject112 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 深度遍历  计算
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
            if (treeNode.left == null && treeNode.right == null) {

            }
            System.out.println(treeNode.val);
        }
        return false;
    }

    public static void main(String[] args) {
        Subject112 subject112 = new Subject112();
        TreeNode treeNode5 = subject112.new TreeNode(5);
        TreeNode treeNode4 = subject112.new TreeNode(4);
        TreeNode treeNode8 = subject112.new TreeNode(8);
        TreeNode treeNode11 = subject112.new TreeNode(11);
        TreeNode treeNode13 = subject112.new TreeNode(13);
        TreeNode treeNode41 = subject112.new TreeNode(4);
        TreeNode treeNode7 = subject112.new TreeNode(7);
        TreeNode treeNode2 = subject112.new TreeNode(2);
        TreeNode treeNode1 = subject112.new TreeNode(1);
        treeNode5.left = treeNode4;
        treeNode5.right = treeNode8;
        treeNode4.left = treeNode11;
        treeNode11.left = treeNode7;
        treeNode11.right = treeNode2;
        treeNode8.left = treeNode13;
        treeNode8.right = treeNode41;
        treeNode41.right = treeNode1;

        boolean b = subject112.hasPathSum(treeNode5, 22);
        System.out.println(b);
    }
}
