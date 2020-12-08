package com.jikong.design.behavior.strategy;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 策略模式 使用者
 * @date 2020/12/8 17:51
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Plus();
        calculator.calculate();
    }
}
