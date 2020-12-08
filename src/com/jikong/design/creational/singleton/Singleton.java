package com.jikong.design.creational.singleton;

/**
 * @author chengjunchao
 * @title: Singleton
 * @projectName algorithm-java
 * @description: 单例模式
 * @date 2020/12/7 9:52
 */
public class Singleton {
    public static final Singleton singleton = new Singleton();

    public void f() {
        System.out.println("单例的方法 f()");
    }
}
