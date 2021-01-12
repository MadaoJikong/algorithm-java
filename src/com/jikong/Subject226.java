package com.jikong;

import java.util.LinkedList;
import java.util.Queue;

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
     * 深度遍历 递归实现
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    /**
     * 广度遍历  队列实现
     *
     * @param root
     * @return
     */
    public TreeNode invertTreeBFS(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //循环体内 顺序获取本层
                TreeNode treeNode = queue.poll();
                TreeNode temp = treeNode.left;
                treeNode.left = treeNode.right;
                treeNode.right = temp;
                //添加下层
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
        }
        return root;
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
        TreeNode treeNode = subject226.invertTreeBFS(treeNode4);
        System.out.println();
    }
}
