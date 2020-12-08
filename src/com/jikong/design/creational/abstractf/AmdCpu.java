package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: AmdCpu
 * @projectName algorithm-java
 * @description: AMD CPU
 * @date 2020/12/7 11:29
 */
public class AmdCpu implements Cpu{
    @Override
    public void calculate() {
        System.out.println("amd的CPU");
    }
}
