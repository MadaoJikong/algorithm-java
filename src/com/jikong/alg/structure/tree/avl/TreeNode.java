package com.jikong.alg.structure.tree.avl;

/**
 * @author chengjunchao
 * @title: TreeNode
 * @projectName algorithm-java
 * @description: 树节点
 * @date 2020/12/24 10:49
 */
public class TreeNode {
    public Integer key;
    int height;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.key = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.key = value;
        this.left = left;
        this.right = right;
        this.height = 0;
    }
}
