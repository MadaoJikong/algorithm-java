package com.jikong.design.creational.simple;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 简单工厂
 * @date 2020/12/7 10:26
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createSms().send();

        factory.createMail().send();
    }
}
