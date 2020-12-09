package com.jikong.design.behavior.observer;

/**
 * @author chengjunchao
 * @title: Subject
 * @projectName algorithm-java
 * @description: 观察者操作 抽象
 * @date 2020/12/9 11:07
 */
public interface Subject {
    /**
     * 添加观察对象
     *
     * @param observer
     */
    void add(Observer observer);

    /**
     * 删除观察对象
     *
     * @param observer
     */
    void del(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     * 自身的操作
     */
    void operation();
}
