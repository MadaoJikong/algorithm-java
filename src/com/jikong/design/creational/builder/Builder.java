package com.jikong.design.creational.builder;

/**
 * @author chengjunchao
 * @title: Builder
 * @projectName algorithm-java
 * @description: builder 建造者
 * @date 2020/12/7 16:08
 */
public interface Builder {
    void buildA();

    void buildB();


    Production build();
}
