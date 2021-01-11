package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject226
 * @projectName algorithm-java
 * @description: 226. 翻转二叉树
 * @date 2021/1/11 18:02
 */
public class Subject226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {

        return null;
    }

    public static void main(String[] args) {
        Subject226 subject226 = new Subject226();
        TreeNode treeNode4 = subject226.new TreeNode(4);
        TreeNode treeNode2 = subject226.new TreeNode(2);
        TreeNode treeNode7 = subject226.new TreeNode(7);
        TreeNode treeNode1 = subject226.new TreeNode(1);
        TreeNode treeNode3 = subject226.new TreeNode(3);
        TreeNode treeNode6 = subject226.new TreeNode(6);
        TreeNode treeNode9 = subject226.new TreeNode(9);
        treeNode4.left = treeNode2;
        treeNode4.right = treeNode7;
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;
        treeNode7.left = treeNode6;
        treeNode7.right = treeNode9;

    }
}
