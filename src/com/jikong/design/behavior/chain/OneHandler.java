package com.jikong.design.behavior.chain;

/**
 * @author chengjunchao
 * @title: MyHandler
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 11:43
 */
public class OneHandler extends AbstractHandler implements Handler {

    /**
     * 算法
     */
    @Override
    public void operation() {
        System.out.println("one");
        if (getHandler() != null) {
            getHandler().operation();
        }
    }
}
