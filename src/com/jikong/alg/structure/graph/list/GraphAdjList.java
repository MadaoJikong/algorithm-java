package com.jikong.alg.structure.graph.list;

import java.util.ArrayList;
import java.util.List;

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

    }

    private void depthFirstSearch(int v) {

    }

    /**
     * 广度优先
     */
    public void breadFirstSearch() {

    }
}
