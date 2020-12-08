package com.jikong.design.structural.proxy;

/**
 * @author chengjunchao
 * @title: Proxy
 * @projectName algorithm-java
 * @description: 代理类
 * @date 2020/12/8 11:30
 */
public class Proxy implements Sourceable {
    private Sourceable source;

    public Proxy() {
        this.source = new Source();
    }

    /**
     * 源方法
     */
    @Override
    public void method() {
        System.out.println("before proxy!");
        source.method();
        System.out.println("after proxy!");
    }
}
