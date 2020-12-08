package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: AmdFactory
 * @projectName algorithm-java
 * @description: AMD 工厂
 * @date 2020/12/7 15:11
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard();
    }
}
