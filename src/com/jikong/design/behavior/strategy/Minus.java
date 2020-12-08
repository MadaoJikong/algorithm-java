package com.jikong.design.behavior.strategy;

/**
 * @author chengjunchao
 * @title: Minus
 * @projectName algorithm-java
 * @description: 减
 * @date 2020/12/8 17:46
 */
public class Minus implements Calculator {
    @Override
    public void calculate() {
        System.out.println("减");
    }
}
