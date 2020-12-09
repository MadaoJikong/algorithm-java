package com.jikong.design.behavior.observer;

/**
 * @author chengjunchao
 * @title: Observer1
 * @projectName algorithm-java
 * @description: 客户1
 * @date 2020/12/9 11:01
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("我是 1");
    }
}
