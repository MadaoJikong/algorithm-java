package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: AmdMainboard
 * @projectName algorithm-java
 * @description: 支持amd的CPU的主板
 * @date 2020/12/7 11:32
 */
public class AmdMainboard implements Mainboard {
    @Override
    public void installCpu() {
        System.out.println("安装AMD的CPU");
    }
}
