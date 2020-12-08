package com.jikong.design.structural.bridge;

/**
 * @author chengjunchao
 * @title: Bridge
 * @projectName algorithm-java
 * @description: 桥接
 * @date 2020/12/8 15:53
 */
public abstract class Bridge implements Sourceable {

    private Sourceable source;

    /**
     * 抽象方法
     */
    @Override
    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
