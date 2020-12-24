package com.jikong.alg.structure.tree.avl;

/**
 * @author chengjunchao
 * @title: TreeNode
 * @projectName algorithm-java
 * @description: 树节点
 * @date 2020/12/24 10:49
 */
public class TreeNode {
    public Integer text;
    public com.jikong.alg.bfs.min.TreeNode left;
    public com.jikong.alg.bfs.min.TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.text = value;
    }
}
