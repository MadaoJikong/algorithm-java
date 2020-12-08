package com.jikong.design.creational.builder;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: Builder 建造者
 * @date 2020/12/7 16:38
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Production production = director.construct();

        System.out.println(production.getUserName() + " ； " + production.getPassword());
    }
}
