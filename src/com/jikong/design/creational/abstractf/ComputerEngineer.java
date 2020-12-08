package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: ComputerEngineer
 * @projectName algorithm-java
 * @description: Abstract Factory  抽象工程
 * @date 2020/12/7 11:51
 */
public class ComputerEngineer {
    public void makeComputer(AbstractFactory af) {
        af.createCpu().calculate();
        af.createMainboard().installCpu();
    }
}
