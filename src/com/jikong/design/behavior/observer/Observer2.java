package com.jikong.design.behavior.observer;

/**
 * @author chengjunchao
 * @title: Observer2
 * @projectName algorithm-java
 * @description: 客户2
 * @date 2020/12/9 11:02
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("我是 2");
    }
}
