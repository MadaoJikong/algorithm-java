package com.jikong.alg.structure.graph.list;

/**
 * 边
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/12 16:09
 */
public class EdgeNode {
    /**
     * 顶点
     */
    public Integer id;
    /**
     * 权值
     */
    public Integer weight;

    public EdgeNode next;

    public EdgeNode() {
    }

    public EdgeNode(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }
}
