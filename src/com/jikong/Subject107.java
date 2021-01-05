package com.jikong;

import java.util.*;

/**
 * @author chengjunchao
 * @title: Subject107
 * @projectName algorithm-java
 * @description: 107. 二叉树的层序遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * @date 2021/1/4 17:04
 */
public class Subject107 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, list, 1);
        Collections.reverse(list);
        return list;
    }

    /**
     * 深度遍历
     *
     * @param root
     * @param list
     * @param index
     */
    private void dfs(TreeNode root, List<List<Integer>> list, int index) {
        if (root == null) {
            return;
        }
        if (list.size() < index) {
            List<Integer> ls = new ArrayList<>();
            list.add(ls);
        }
        list.get(index - 1).add(root.val);
        dfs(root.left, list, index + 1);
        dfs(root.right, list, index + 1);
    }

    public List<List<Integer>> levelOrderBottom1(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        bfs(root, list);
        Collections.reverse(list);
        return list;
    }

    private void bfs(TreeNode root, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            int size = queue.size();
            List<Integer> ls = new ArrayList<>();
            list.add(ls);
            //扩散
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                ls.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        Subject107 subject107 = new Subject107();
//        TreeNode treeNode3 = subject107.new TreeNode(3);
//        TreeNode treeNode9 = subject107.new TreeNode(9);
//        TreeNode treeNode20 = subject107.new TreeNode(20);
//        TreeNode treeNode15 = subject107.new TreeNode(15);
//        TreeNode treeNode7 = subject107.new TreeNode(7);
//        treeNode3.left = treeNode9;
//        treeNode3.right = treeNode20;
//        treeNode20.left = treeNode15;
//        treeNode20.right = treeNode7;

        TreeNode treeNode1 = subject107.new TreeNode(1);
        TreeNode treeNode2 = subject107.new TreeNode(2);
        TreeNode treeNode3 = subject107.new TreeNode(3);
        TreeNode treeNode4 = subject107.new TreeNode(4);
        TreeNode treeNode5 = subject107.new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.right = treeNode5;

//        List<List<Integer>> list = subject107.levelOrderBottom(treeNode1);
//        System.out.println(list);
        List<List<Integer>> list = subject107.levelOrderBottom1(treeNode1);
        System.out.println(list);
    }
}
