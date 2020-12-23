package com.jikong.alg.bfs.min;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chengjunchao
 * @title: MinDepth
 * @projectName algorithm-java
 * @description: 二叉树的最小高度
 * @date 2020/12/22 13:57
 */
public class MinDepth {
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

        MinDepth minDepth = new MinDepth();
        int n = minDepth.minDepth(treeNode3);
        System.out.println(n);
    }

    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        // root 本身就是一层，depth 初始化为 1
        int depth = 1;

        while (!q.isEmpty()) {
            int sz = q.size();
            /* 将当前队列中的所有节点向四周扩散 */
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                /* 判断是否到达终点 */
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
                /* 将 cur 的相邻节点加入队列 */
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            /* 这里增加步数 */
            depth++;
        }
        return depth;
    }
}
