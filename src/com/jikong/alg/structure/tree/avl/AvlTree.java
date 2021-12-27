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

    private void inOrder(TreeNode tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.print(tree.key + " ");
            inOrder(tree.right);
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

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private TreeNode insert(TreeNode tree, int key) {
        if (tree == null) {
            // 新建节点
            tree = new TreeNode(key, null, null);
        } else {
            int com = compare(key, tree.key);
            if (com < 0) {
                tree.left = insert(tree.left, key);
                if (height(tree.left) - height(tree.right) == 2) {
                    if (compare(key, tree.left.key) < 0) {
                        tree = leftLeftRotation(tree);
                    } else {
                        tree = leftRightRotation(tree);
                    }
                }
            } else if (com > 0) {
                tree.right = insert(tree.right, key);
                if (height(tree.right) - height(tree.left) == 2) {
                    if (compare(key, tree.right.key) > 0) {
                        tree = rightRightRotation(tree);
                    } else {
                        tree = rightLeftRotation(tree);
                    }
                }
            } else {
//                tree.right = insert(tree.right, key);
//                tree.height = max(tree.height, tree.right.height + 1);
//                if (height(tree.right) - height(tree.left) == 2) {
//                    if (compare(tree.right.key, key) > 0) {
//                        tree = rightRightRotation(tree);
//                    } else {
//                        tree = rightLeftRotation(tree);
//                    }
//                }
            }
        }
        tree.height = max(height(tree.left), height(tree.right)) + 1;
        return tree;
    }

    public void insert(int key) {
        root = insert(root, key);
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


    private TreeNode leftLeftRotation(TreeNode k2) {
        TreeNode k1;

        k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        //关于高度，树的高度即为最大层次。
        //即空的二叉树的高度是0，非空树的高度从1计数，等于它的最大层次(根的层次为1，根的子节点为第2层，依次类推)。
        k2.height = max(height(k2.left), height(k2.right)) + 1;
        k1.height = max(height(k1.left), k2.height) + 1;//左右比较

        return k1;
    }

    private TreeNode rightRightRotation(TreeNode k1) {
        TreeNode k2;

        k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;

        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;

        return k2;
    }

    /*
     * LR：左右对应的情况(左双旋转)。--对应RR-LL
     *(插入节点是左子树的右边节点)
     * 返回值：旋转后的根节点
     */
    private TreeNode leftRightRotation(TreeNode k3) {

        k3.left = rightRightRotation(k3.left);

        return leftLeftRotation(k3);
    }

    /*
     * RL：右左对应的情况(右双旋转)。对应 LL-RR
     *(插入节点是右子树的左边节点)
     * 返回值：旋转后的根节点
     */
    private TreeNode rightLeftRotation(TreeNode k1) {
        k1.right = leftLeftRotation(k1.right);

        return rightRightRotation(k1);
    }

}
