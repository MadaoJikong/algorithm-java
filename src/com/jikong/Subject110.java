package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject110
 * @projectName algorithm-java
 * @description: 110. 平衡二叉树
 * @date 2021/1/6 10:05
 */
public class Subject110 {
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

    public boolean isBalanced(TreeNode root) {
        if (dfs(root) == -1) {
            return false;
        }
        return true;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        if (left == -1) {
            return -1;
        }
        int right = dfs(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

    public static void main(String[] args) {
        Subject110 subject110 = new Subject110();
//        TreeNode treeNode3 = subject110.new TreeNode(3);
//        TreeNode treeNode9 = subject110.new TreeNode(9);
//        TreeNode treeNode20 = subject110.new TreeNode(20);
//        TreeNode treeNode15 = subject110.new TreeNode(15);
//        TreeNode treeNode7 = subject110.new TreeNode(7);
//        treeNode3.left = treeNode9;
//        treeNode3.right = treeNode20;
//        treeNode20.left = treeNode15;
//        treeNode20.right = treeNode7;

        TreeNode treeNode1 = subject110.new TreeNode(1);
        TreeNode treeNode2 = subject110.new TreeNode(2);
        TreeNode treeNode21 = subject110.new TreeNode(2);
        TreeNode treeNode3 = subject110.new TreeNode(3);
        TreeNode treeNode31 = subject110.new TreeNode(3);
        TreeNode treeNode4 = subject110.new TreeNode(4);
        TreeNode treeNode41 = subject110.new TreeNode(4);


        boolean b = subject110.isBalanced(treeNode1);
        System.out.println(b);
    }
}
