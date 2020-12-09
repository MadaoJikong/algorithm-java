package com.jikong.design.behavior.observer;

/**
 * @author chengjunchao
 * @title: MySubject
 * @projectName algorithm-java
 * @description: 我的主操作
 * @date 2020/12/9 11:13
 */
public class MySubject extends AbstractSubject {
    /**
     * 自身的操作
     */
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
