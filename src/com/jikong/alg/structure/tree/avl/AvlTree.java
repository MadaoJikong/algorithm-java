package com.jikong.alg.structure.tree.avl;

import java.util.LinkedList;
import java.util.Queue;

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

    /**
     * 广度遍历
     */
    public void bfs() {
        b(root);
    }

    /**
     * 广度遍历
     *
     * @param root
     */
    private void b(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    System.out.print(treeNode.key + ":" + treeNode.height + " ");
                } else {
                    System.out.print("null ");
                }
                if (treeNode != null) {
                    if (treeNode.left != null) {
                        queue.offer(treeNode.left);
                    } else {
                        queue.offer(null);
                    }
                }
                if (treeNode != null) {
                    if (treeNode.right != null) {
                        queue.offer(treeNode.right);
                    } else {
                        queue.offer(null);
                    }
                }
            }
            System.out.println();

        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private TreeNode insert(TreeNode tree, int key, int height) {
        if (tree == null) {
            // 新建节点
            tree = new TreeNode(key, null, null);
            tree.height = height;
        } else {
            int com = compare(key, tree.key);
            if (com < 0) {
                tree.left = insert(tree.left, key, height + 1);
            } else if (com > 0) {
                tree.right = insert(tree.right, key, height + 1);
            } else {
                tree.right = insert(tree.right, key, height + 1);
            }
        }
        return tree;
    }

    public void insert(int key) {
        root = insert(root, key, 1);
    }

    /**
     * 获取某一结点的高度
     *
     * @return
     */
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    /**
     * 获取节点的平衡因子
     *
     * @param node
     * @return
     */
    private int getBalanceFactor(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }


    private TreeNode leftLeftRotation(TreeNode treeNode) {
        return null;
    }
}
