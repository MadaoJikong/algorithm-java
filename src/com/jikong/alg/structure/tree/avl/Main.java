package com.jikong.alg.structure.tree.avl;

/**
 * 执行
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2021/12/17 17:23
 */
public class Main {
    public static void main(String[] args) {
        AvlTree avlTree = new AvlTree();
        avlTree.insert(10);
        avlTree.insert(1);
        avlTree.insert(2);
        avlTree.insert(3);
        avlTree.insert(11);
        avlTree.insert(10);
        avlTree.insert(14);

        avlTree.bfs();
    }
}
