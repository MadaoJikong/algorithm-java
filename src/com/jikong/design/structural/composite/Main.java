package com.jikong.design.structural.composite;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 组合模式 使用者
 * @date 2020/12/8 17:10
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
