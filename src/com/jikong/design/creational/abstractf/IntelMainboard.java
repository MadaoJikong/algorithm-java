package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: IntelMainboard
 * @projectName algorithm-java
 * @description: 支持英特尔cpu的主板
 * @date 2020/12/7 11:31
 */
public class IntelMainboard implements Mainboard{
    @Override
    public void installCpu() {
        System.out.println("安装英特尔的CPU");
    }
}
