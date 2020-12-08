package com.jikong.design.structural.facade;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 外观模式 使用
 * @date 2020/12/8 14:45
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }
}
