package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: AbstractFactory
 * @projectName algorithm-java
 * @description: 抽象工程
 * @date 2020/12/7 14:35
 */
public interface AbstractFactory {
    Cpu createCpu();

    Mainboard createMainboard();
}
