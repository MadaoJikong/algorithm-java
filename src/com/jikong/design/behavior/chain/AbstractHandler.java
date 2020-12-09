package com.jikong.design.behavior.chain;

/**
 * @author chengjunchao
 * @title: AbstractHandler
 * @projectName algorithm-java
 * @description: 抽象处理
 * @date 2020/12/9 11:44
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return this.handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
