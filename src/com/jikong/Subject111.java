package com.jikong;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chengjunchao
 * @title: Subject111
 * @projectName algorithm-java
 * @description: 111. 二叉树的最小深度
 * @date 2021/1/6 14:00
 */
public class Subject111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 使用广度遍历方式
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left == null && treeNode.right == null) {
                    return height;
                }
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            height++;
        }
        return height;
    }


    public static void main(String[] args) {
        Subject111 subject111 = new Subject111();
        TreeNode treeNode3 = subject111.new TreeNode(3);
        TreeNode treeNode9 = subject111.new TreeNode(9);
        TreeNode treeNode20 = subject111.new TreeNode(20);
        TreeNode treeNode15 = subject111.new TreeNode(15);
        TreeNode treeNode7 = subject111.new TreeNode(7);
        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;
        treeNode20.left = treeNode15;
        treeNode20.right = treeNode7;

        int n = subject111.minDepth(treeNode3);
        System.out.println(n);
    }
}
