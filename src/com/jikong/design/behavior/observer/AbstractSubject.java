package com.jikong.design.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author chengjunchao
 * @title: AbstractSubject
 * @projectName algorithm-java
 * @description: 抽象 主体
 * @date 2020/12/9 11:10
 */
public abstract class AbstractSubject implements Subject {

    /**
     * 用来存储观察对象的容器
     */
    private Vector<Observer> vector = new Vector<Observer>();

    /**
     * 添加观察对象
     *
     * @param observer
     */
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    /**
     * 删除观察对象
     *
     * @param observer
     */
    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}
