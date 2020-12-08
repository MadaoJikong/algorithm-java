package com.jikong.design.structural.composite;

/**
 * @author chengjunchao
 * @title: Tree
 * @projectName algorithm-java
 * @description: 树
 * @date 2020/12/8 17:09
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }
}
