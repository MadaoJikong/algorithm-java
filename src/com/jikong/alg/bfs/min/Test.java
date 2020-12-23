package com.jikong.alg.bfs.min;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chengjunchao
 * @title: Test
 * @projectName algorithm-java
 * @description: 练习
 * @date 2020/12/23 10:39
 */
public class Test {
    public static void main(String[] args) {
        //前序遍历  3，9，20，null，null，15，7
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode3.left = treeNode9;
        treeNode3.right = treeNode20;
        treeNode20.left = treeNode15;
        treeNode20.right = treeNode7;
        Test test = new Test();
        int n = test.minDepth(treeNode3);
        System.out.println(n);
    }

    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left == null && treeNode.right == null) {
                    return depth;
                }
                //本层没有，把当前层的下一层都拿到
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
