package com.jikong;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chengjunchao
 * @title: Subject100
 * @projectName algorithm-java
 * @description: 100. 相同的树
 * @date 2020/12/31 14:20
 */
public class Subject100 {
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
     * 广度遍历
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();
        if (p != null) {
            queueP.offer(p);
        }
        if (q != null) {
            queueQ.offer(q);
        }
        while (!queueP.isEmpty() || !queueQ.isEmpty()) {
            int sizeP = queueP.size();
            int sizeQ = queueQ.size();
            if (sizeP != sizeQ) {
                return false;
            }
            for (int i = 0; i < sizeP; i++) {
                TreeNode treeNodeP = queueP.poll();
                TreeNode treeNodeQ = queueQ.poll();
                if (treeNodeP.val != treeNodeQ.val) {
                    return false;
                }
                if ((treeNodeP.left == null && treeNodeQ.left != null) || (treeNodeP.left != null && treeNodeQ.left == null)) {
                    return false;
                }
                if ((treeNodeP.right == null && treeNodeQ.right != null) || (treeNodeP.right != null && treeNodeQ.right == null)) {
                    return false;
                }
                if (treeNodeP.left != null && treeNodeQ.left != null) {
                    queueP.offer(treeNodeP.left);
                    queueQ.offer(treeNodeQ.left);
                }
                if (treeNodeP.right != null && treeNodeQ.right != null) {
                    queueP.offer(treeNodeP.right);
                    queueQ.offer(treeNodeQ.right);
                }
            }
        }
        return true;
    }

    /**
     * 深度遍历
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if ((p != null && q != null) && (p.val != q.val)) {
            return false;
        }
        if (p != null && q != null) {
            boolean l = isSameTree1(p.left, q.left);
            boolean r = isSameTree1(p.right, q.right);
            return l && r;
        }
        return true;
    }

    public static void main(String[] args) {
        Subject100 subject100 = new Subject100();
        Subject100.TreeNode treeNode1 = subject100.new TreeNode(1);
        Subject100.TreeNode treeNode2 = subject100.new TreeNode(2);
        Subject100.TreeNode treeNode3 = subject100.new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        Subject100.TreeNode treeNodeN1 = subject100.new TreeNode(1);
        Subject100.TreeNode treeNodeN2 = subject100.new TreeNode(2);
        Subject100.TreeNode treeNodeN3 = subject100.new TreeNode(3);
        treeNodeN1.left = treeNode2;
        treeNodeN1.right = treeNodeN3;

        boolean b = subject100.isSameTree1(treeNode1, treeNodeN1);
        System.out.println(b);
    }
}
