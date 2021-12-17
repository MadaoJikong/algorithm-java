package com.jikong.alg.structure.tree.avl;

/**
 * avl树
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2021/12/17 16:56
 */
public class AvlTree {
    private TreeNode root;

    /**
     * 构造函数
     */
    public AvlTree() {
        root = null;
    }

    /**
     * 树的高度
     *
     * @param tree
     * @return
     */
    private int height(TreeNode tree) {
        if (tree != null) {
            return tree.height;
        }

        return 0;
    }

    public int height() {
        return height(root);
    }

    /**
     * 比较大小
     *
     * @param a
     * @param b
     * @return
     */
    private int max(int a, int b) {
        return a > b ? a : b;
    }

    private int compare(int a, int b) {
        if (a < b) {
            return -1;
        } else if (a > b) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 前序遍历"AVL树"
     *
     * @param tree
     */
    private void preOrder(TreeNode tree) {
        if (tree != null) {
            System.out.print(tree.key + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private TreeNode insert(TreeNode tree, int key) {
        if (tree == null) {
            // 新建节点
            tree = new TreeNode(key, null, null);
        } else {
            int com = compare(key, tree.key);
        }
        return tree;
    }

    public void insert(int key) {
        root = insert(root, key);
    }
}
