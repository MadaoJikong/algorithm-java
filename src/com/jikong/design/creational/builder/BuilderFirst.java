package com.jikong.design.creational.builder;

/**
 * @author chengjunchao
 * @title: BuilderFirst
 * @projectName algorithm-java
 * @description: 第一个建造者实现
 * @date 2020/12/7 16:10
 */
public class BuilderFirst implements Builder {
    Production p = new Production();

    @Override
    public void buildA() {
        p.setUserName("first：username-a");
    }

    @Override
    public void buildB() {
        p.setPassword("first：password-a");
    }

    @Override
    public Production build() {
        return p;
    }
}
