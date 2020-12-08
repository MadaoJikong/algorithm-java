package com.jikong.design.creational.abstractf;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: Abstract Factory  抽象工程
 * @date 2020/12/7 13:37
 */
public class Main {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory af = new IntelFactory();
        computerEngineer.makeComputer(af);
    }
}
