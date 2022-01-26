package com.jikong.alg.structure.graph.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 邻接表
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/20 10:48
 */
public class GraphAdjList {
    /**
     * 顶点
     */
    public VexNode[] vexNodes;
    /**
     * 是否访问
     */
    public boolean[] isVisited;

    /**
     * 获取连接的点
     *
     * @param v1 当前点
     * @param v2
     * @return
     */
    public int getNextNeighbor(int v1, int v2) {
        if (v2 == -1) {
            return vexNodes[v1].edgeNode.id;
        } else {
            int m = 0;
            EdgeNode edgeNode = vexNodes[v1].edgeNode;
            while (edgeNode != null && m != -1) {
                if (v2 == edgeNode.id) {
                    return edgeNode.id;
                }
                edgeNode = edgeNode.next;
            }
        }
        return -1;
    }

    /**
     * 获取临近点权重
     *
     * @param from
     * @param to
     * @return
     */
    public int weight(int from, int to) {
        VexNode vexNode = vexNodes[from];
        EdgeNode edgeNode = vexNode.edgeNode;
        while (edgeNode != null) {
            if (edgeNode.id == to) {
                return edgeNode.weight;
            }
            edgeNode = edgeNode.next;
        }
        return -1;
    }

    /**
     * 获取临近点
     *
     * @param s
     * @return
     */
    List<Integer> adj(int s) {
        List<Integer> list = new ArrayList<>();
        VexNode vexNode = vexNodes[s];
        EdgeNode edgeNode = vexNode.edgeNode;
        while (edgeNode != null) {
            list.add(edgeNode.id);
            edgeNode = edgeNode.next;
        }
        return list;
    }

    /**
     * 深度优先
     */
    public void depthFirstSearch() {
        for (int i = 0; i < vexNodes.length; i++) {
            isVisited[i] = true;
            System.out.print(vexNodes[i].data.name + " ");
            depthFirstSearch(i);
            System.out.println();
            for (int n = 0; n < isVisited.length; n++) {
                isVisited[n] = false;
            }
        }
    }

    private void depthFirstSearch(int v) {
        if (!isVisited[v]) {
            isVisited[v] = true;
            System.out.print(vexNodes[v].data.name + " ");
        }
        List<Integer> ids = adj(v);
        if (ids.isEmpty()) {
            return;
        }
        for (int i : ids) {
            if (!isVisited[i]) {
                depthFirstSearch(i);
            }
        }
    }

    /**
     * 广度优先
     */
    public void breadFirstSearch() {
        for (int i = 0; i < vexNodes.length; i++) {
            isVisited[i] = true;
            System.out.print(vexNodes[i].data.name + " ");
            breadFirstSearch(i);
            System.out.println();
            for (int n = 0; n < isVisited.length; n++) {
                isVisited[n] = false;
            }
        }
    }

    private void breadFirstSearch(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int w = queue.poll();
            if (!isVisited[w]) {
                isVisited[w] = true;
                System.out.print(vexNodes[w].data.name + " ");
            }
            List<Integer> ids = adj(w);
            for (int i = 0; i < ids.size(); i++) {
                if (!isVisited[ids.get(i)]) {
                    isVisited[ids.get(i)] = true;
                    System.out.print(vexNodes[ids.get(i)].data.name + " ");
                    queue.offer(ids.get(i));
                }
            }
        }
    }
}
