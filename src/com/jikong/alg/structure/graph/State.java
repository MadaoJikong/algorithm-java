package com.jikong.alg.structure.graph;

/**
 * 图深度计数器
 *
 * @author chengjunchao
 * @version 1.0.0
 * @date 2022/1/18 10:19
 */
public class State {
    /**
     * 图节点
     */
    public int id;
    /**
     * 从 start 节点到当前节点的距离
     */
    public int distFromStart;

    public State() {
    }

    public State(int id, int distFromStart) {
        this.id = id;
        this.distFromStart = distFromStart;
    }
}
