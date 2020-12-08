package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: IntelFactory
 * @projectName algorithm-java
 * @description: 因特尔工厂
 * @date 2020/12/7 14:37
 */
public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard();
    }
}
