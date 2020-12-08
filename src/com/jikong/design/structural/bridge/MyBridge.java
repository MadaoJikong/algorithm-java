package com.jikong.design.structural.bridge;

/**
 * @author chengjunchao
 * @title: MyBridge
 * @projectName algorithm-java
 * @description: 桥接
 * @date 2020/12/8 16:47
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
