package com.jikong.design.structural.bridge;

/**
 * @author chengjunchao
 * @title: SourceSub1
 * @projectName algorithm-java
 * @description: 子
 * @date 2020/12/8 15:51
 */
public class SourceSub1 implements Sourceable{
    /**
     * 抽象方法
     */
    @Override
    public void method() {
        System.out.println("Source-sub-1");
    }
}
