package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject104
 * @projectName algorithm-java
 * @description: 104. 二叉树的最大深度
 * @date 2021/1/4 15:18
 */
public class Subject104 {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

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
     * 深度优先
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //广度优先 是每层加1  加到不能加为止 就是最大深度。
    public static void main(String[] args) {
        Subject104 subject104 = new Subject104();
        Subject104.TreeNode treeNode1 = subject104.new TreeNode(3);
        Subject104.TreeNode treeNode2 = subject104.new TreeNode(9);
        Subject104.TreeNode treeNode3 = subject104.new TreeNode(20);
        Subject104.TreeNode treeNode4 = subject104.new TreeNode(15);
        Subject104.TreeNode treeNode5 = subject104.new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        int n = subject104.maxDepth(treeNode1);
        System.out.println(n);
    }
}
