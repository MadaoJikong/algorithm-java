package com.jikong.design.structural.adapter;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 适配器执行  适配器由原来的Source 加工成需要的，在Adapter类中提供加工
 * @date 2020/12/8 10:23
 */
public class Main {
    public static void main(String[] args) {
        Targetable a = new Adapter();
        a.method1();
        a.method2();
    }
}
