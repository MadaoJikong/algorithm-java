package com.jikong.design.structural.adapter;

/**
 * @author chengjunchao
 * @title: Adapter
 * @projectName algorithm-java
 * @description: 适配器
 * @date 2020/12/8 10:20
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("适配器-方法2");
    }
}
