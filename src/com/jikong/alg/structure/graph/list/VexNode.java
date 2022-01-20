package com.jikong.alg.structure.graph.list;

import com.jikong.alg.structure.graph.Point;

/**
 * 顶点
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/20 10:39
 */
public class VexNode {
    /**
     * 定点信息
     */
    public Point data;
    public Integer id;

    /**
     * 邻接表
     */
    public EdgeNode edgeNode;

    public VexNode() {
    }

    public VexNode(Point data, EdgeNode edgeNode, int id) {
        this.data = data;
        this.edgeNode = edgeNode;
        this.id = id;
    }
}
