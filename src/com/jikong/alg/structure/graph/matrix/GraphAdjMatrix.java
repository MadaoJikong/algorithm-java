package com.jikong.alg.structure.graph.matrix;

import com.jikong.alg.structure.graph.Point;
import com.jikong.alg.structure.graph.State;

import java.util.*;

/**
 * 邻接矩阵
 * https://www.cnblogs.com/rainday1/p/6580423.html
 * https://labuladong.gitee.io/algo/2/19/43/
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
            int w = queue.poll();
            int v = getFirstNeighbor(w);
            if (v != -1 && !isVisited[v]) {
                if (v > -1) {
                    isVisited[v] = true;
                    System.out.print(vexs[v] + " ");
                    queue.offer(v);
                }
            }
            while (v != -1) {
                v = getNextNeighbor(w, v);
                if (v != -1 && !isVisited[v]) {
                    if (v > -1) {
                        isVisited[v] = true;
                        System.out.print(vexs[v] + " ");
                        queue.offer(v);
                    }
                }
            }
        }
    }

    /**
     * 返回节点 from 到节点 to 之间的边的权重   两个相邻点
     *
     * @param from
     * @param to
     * @return
     */
    public int weight(int from, int to) {
        return edges[from][to];
    }

    /**
     * 输入节点 s 返回 s 的相邻节点
     *
     * @param s
     * @return
     */
    List<Integer> adj(int s) {
        List<Integer> list = new ArrayList<>();
        int v = getFirstNeighbor(s);
        if (v != -1) {
            list.add(v);
        }
        while (v != -1) {
            v = getNextNeighbor(s, v);
            if (v != -1) {
                list.add(v);
            }
        }
        return list;
    }

    /**
     * 输入一幅图和一个起点 start，计算 start 到其他节点的最短距离
     */
    public int[] dijkstra(int start) {
        // 图中节点的个数
        int v = vexs.length;
        // 记录最短路径的权重，你可以理解为 dp table
        // 定义：distTo[i] 的值就是节点 start 到达节点 i 的最短路径权重
        int[] distTo = new int[v];
        // 求最小值，所以 dp table 初始化为正无穷
        Arrays.fill(distTo, Integer.MAX_VALUE);
        // base case，start 到 start 的最短距离就是 0
        distTo[start] = 0;
        // 优先级队列，distFromStart 较小的排在前面
        Queue<State> queue = new PriorityQueue<>((a, b) -> {
            return a.distFromStart - b.distFromStart;
        });
        // 从起点 start 开始进行 BFS
        queue.offer(new State(start, 0));

        while (!queue.isEmpty()) {
            State currentState = queue.poll();
            int currentNodeId = currentState.id;
            int currentDistFromStart = currentState.distFromStart;
            if (currentDistFromStart > distTo[currentNodeId]) {
                // 已经有一条更短的路径到达 currentNode 节点了
                continue;
            }
            // 将 currentNode 的相邻节点装入队列
            for (int nextNodeId : adj(currentNodeId)) {
                // 看看从 curNode 达到 nextNode 的距离是否会更短
                int distToNextNode = distTo[currentNodeId] + weight(currentNodeId, nextNodeId);
                if (distTo[nextNodeId] > distToNextNode) {
                    // 更新 dp table
                    distTo[nextNodeId] = distToNextNode;
                    // 将这个节点以及距离放入队列
                    queue.offer(new State(nextNodeId, distToNextNode));
                }
            }
        }

        return distTo;
    }

    /**
     * 两点的最短距离
     *
     * @param start
     * @param end
     * @return
     */
    public int dijkstra(int start, int end) {
        // 图中节点的个数
        int v = vexs.length;
        // 记录最短路径的权重，你可以理解为 dp table
        // 定义：distTo[i] 的值就是节点 start 到达节点 i 的最短路径权重
        int[] distTo = new int[v];
        // 求最小值，所以 dp table 初始化为正无穷
        Arrays.fill(distTo, Integer.MAX_VALUE);
        // base case，start 到 start 的最短距离就是 0
        distTo[start] = 0;
        // 优先级队列，distFromStart 较小的排在前面
        Queue<State> queue = new PriorityQueue<>((a, b) -> {
            return a.distFromStart - b.distFromStart;
        });
        // 从起点 start 开始进行 BFS
        queue.offer(new State(start, 0));

        while (!queue.isEmpty()) {
            State currentState = queue.poll();
            int currentNodeId = currentState.id;
            int currentDistFromStart = currentState.distFromStart;

            if (currentNodeId == end) {
                return currentDistFromStart;
            }

            if (currentDistFromStart > distTo[currentNodeId]) {
                // 已经有一条更短的路径到达 currentNode 节点了
                continue;
            }
            // 将 currentNode 的相邻节点装入队列
            for (int nextNodeId : adj(currentNodeId)) {
                // 看看从 curNode 达到 nextNode 的距离是否会更短
                int distToNextNode = distTo[currentNodeId] + weight(currentNodeId, nextNodeId);
                if (distTo[nextNodeId] > distToNextNode) {
                    // 更新 dp table
                    distTo[nextNodeId] = distToNextNode;
                    // 将这个节点以及距离放入队列
                    queue.offer(new State(nextNodeId, distToNextNode));
                }
            }
        }

        return Integer.MAX_VALUE;
    }
}
