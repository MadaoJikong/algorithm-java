package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: IntelCpu
 * @projectName algorithm-java
 * @description: 英特尔 CPU
 * @date 2020/12/7 11:28
 */
public class IntelCpu implements Cpu{
    @Override
    public void calculate() {
        System.out.println("英特尔的CPU");
    }
}
