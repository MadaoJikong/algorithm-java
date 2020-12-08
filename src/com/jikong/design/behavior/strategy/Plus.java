package com.jikong.design.behavior.strategy;

/**
 * @author chengjunchao
 * @title: Plus
 * @projectName algorithm-java
 * @description: 加
 * @date 2020/12/8 17:45
 */
public class Plus implements Calculator {
    @Override
    public void calculate() {
        System.out.println("加");
    }
}
