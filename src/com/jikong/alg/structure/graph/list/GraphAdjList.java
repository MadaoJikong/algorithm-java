package com.jikong.alg.structure.graph.list;

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
    }
}
