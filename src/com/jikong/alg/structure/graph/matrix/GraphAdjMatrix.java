package com.jikong.alg.structure.graph.matrix;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 邻接矩阵
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/12 18:28
 */
public class GraphAdjMatrix {
    /**
     * 顶点
     */
    public Point[] vexs;
    public boolean[] isVisited;
    /**
     * 边
     */
    public int[][] edges;

    public GraphAdjMatrix() {
    }

    public boolean insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        return true;
    }

    /**
     * 获取第一个连接的结点
     *
     * @param index
     * @return
     */
    public int getFirstNeighbor(int index) {
        for (int i = 0; i < vexs.length; i++) {
            if (edges[index][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取前一个邻接结点的下标来取得下一个邻接结点
     *
     * @param v1
     * @param v2
     * @return
     */
    public int getNextNeighbor(int v1, int v2) {
        for (int i = v2 + 1; i < vexs.length; i++) {
            if (edges[v1][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 深度优先遍历
     *
     * @return
     */
    public void depthFirstSearch() {
        for (int i = 0; i < vexs.length; i++) {
            depthFirstSearch(isVisited, i);
            System.out.println();
            for (int n = 0; n < isVisited.length; n++) {
                isVisited[n] = false;
            }
        }
    }

    /**
     * 递归实现
     *
     * @param isVisited
     * @param i
     */
    private void depthFirstSearch(boolean[] isVisited, int i) {
        System.out.print(vexs[i] + " ");
        isVisited[i] = true;
        int w = getFirstNeighbor(i);
        while (w != -1) {
            if (!isVisited[w]) {
                //递归找下一个结点  往深的找
                depthFirstSearch(isVisited, w);
            }
            // 扩散 找其他的连接 结点
            w = getNextNeighbor(i, w);
        }
    }

    /**
     * 广度优先遍历
     *
     * @return
     */
    public void breadFirstSearch() {
        for (int i = 0; i < vexs.length; i++) {
            breadFirstSearch(isVisited, i);
            System.out.println();
            for (int n = 0; n < isVisited.length; n++) {
                isVisited[n] = false;
            }
        }
    }

    private void breadFirstSearch(boolean[] isVisited, int i) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.print(vexs[i] + " ");
        isVisited[i] = true;
        queue.offer(i);
        while (!queue.isEmpty()) {
            int m = -1;
            int j = queue.poll();
            int n = getFirstNeighbor(j);
            if (n > 0) {
                isVisited[n] = true;
                System.out.print(vexs[n] + " ");
            }
            while (m != -1) {
                if (!isVisited[m]) {
                    if (m > 0) {
                        isVisited[m] = true;
                        System.out.print(vexs[m] + " ");
                        queue.offer(m);
                    }
                }
                m = getNextNeighbor(j, n);
            }
        }
    }
}
