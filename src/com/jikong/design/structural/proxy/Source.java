package com.jikong.design.structural.proxy;

/**
 * @author chengjunchao
 * @title: Source
 * @projectName algorithm-java
 * @description: 源类
 * @date 2020/12/8 11:29
 */
public class Source implements Sourceable {
    /**
     * 源方法
     */
    @Override
    public void method() {
        System.out.println("Source-方法");
    }
}
