package com.jikong.design.behavior.chain;

/**
 * @author chengjunchao
 * @title: TwoHandler
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 11:48
 */
public class TwoHandler extends AbstractHandler implements Handler {
    /**
     * 算法
     */
    @Override
    public void operation() {
        System.out.println("two");
        if (getHandler() != null) {
            getHandler().operation();
        }
    }
}
