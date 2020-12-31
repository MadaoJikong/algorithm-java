package com.jikong;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author chengjunchao
 * @title: Subject101
 * @projectName algorithm-java
 * @description: 101. 对称二叉树
 * @date 2020/12/31 16:02
 */
public class Subject101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 使用广度遍历 一颗
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        list.add(root.left);
        list.add(root.right);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (i < size / 2) {
                    if (list.get(i) == null && list.get(size - 1 - i) != null) {
                        return false;
                    }
                    if (list.get(i) != null && list.get(size - 1 - i) == null) {
                        return false;
                    }
                    if (list.get(i) != null && list.get(size - 1 - i) != null) {
                        if (list.get(i).val != list.get(size - 1 - i).val) {
                            return false;
                        }
                    }
                }
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    queue.offer(treeNode.left);
                    queue.offer(treeNode.right);
                }
            }
            list.clear();
            list = new ArrayList<>(queue);
        }
        return true;
    }

    /**
     * 深度遍历
     *
     * @param root
     * @return
     */
    public boolean isSymmetric1(TreeNode root) {

        return false;
    }

    private boolean check1(TreeNode l, TreeNode r) {
        return false;
    }

    public static void main(String[] args) {
        Subject101 subject101 = new Subject101();
        Subject101.TreeNode treeNode1 = subject101.new TreeNode(1);
        Subject101.TreeNode treeNode2 = subject101.new TreeNode(2);
        Subject101.TreeNode treeNode3 = subject101.new TreeNode(2);
        Subject101.TreeNode treeNode4 = subject101.new TreeNode(3);
        Subject101.TreeNode treeNode5 = subject101.new TreeNode(4);
        Subject101.TreeNode treeNode6 = subject101.new TreeNode(4);
        Subject101.TreeNode treeNode7 = subject101.new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;


//        Subject101.TreeNode treeNode1 = subject101.new TreeNode(1);
//        Subject101.TreeNode treeNode2 = subject101.new TreeNode(2);
//        Subject101.TreeNode treeNode3 = subject101.new TreeNode(2);
//        Subject101.TreeNode treeNode5 = subject101.new TreeNode(3);
//        Subject101.TreeNode treeNode7 = subject101.new TreeNode(3);
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.right = treeNode5;
//        treeNode3.right = treeNode7;

        boolean b = subject101.isSymmetric(treeNode1);
        System.out.println(b);
    }
}
