package com.jikong.design.structural.decorator;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 装饰模式测试类
 * @date 2020/12/8 11:13
 */
public class Main {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}
