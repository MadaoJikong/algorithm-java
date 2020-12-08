package com.jikong.design.structural.bridge;

/**
 * @author chengjunchao
 * @title: Sourceable
 * @projectName algorithm-java
 * @description: 源 将抽象化与实现化解耦，使得二者可以独立变化
 * @date 2020/12/8 15:40
 */
public interface Sourceable {
    /**
     * 抽象方法
     */
    void method();
}
