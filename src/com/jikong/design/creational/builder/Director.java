package com.jikong.design.creational.builder;

/**
 * @author chengjunchao
 * @title: Director
 * @projectName algorithm-java
 * @description: 调度
 * @date 2020/12/7 16:35
 */
public class Director {
    public Production construct() {
        Builder builder = new BuilderFirst();
        builder.buildA();
        builder.buildB();
        return builder.build();
    }
}
