package com.jikong.design.structural.decorator;

/**
 * @author chengjunchao
 * @title: Source
 * @projectName algorithm-java
 * @description: 被装饰
 * @date 2020/12/8 11:05
 */
public class Source implements Sourceable{

    @Override
    public void method() {
        System.out.println("Source-方法");
    }
}
