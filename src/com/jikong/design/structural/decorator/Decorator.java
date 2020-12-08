package com.jikong.design.structural.decorator;

/**
 * @author chengjunchao
 * @title: Decorator
 * @projectName algorithm-java
 * @description: 装饰
 * @date 2020/12/8 11:08
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
