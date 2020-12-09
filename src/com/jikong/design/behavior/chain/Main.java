package com.jikong.design.behavior.chain;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 11:48
 */
public class Main {
    public static void main(String[] args) {
        OneHandler oneHandler = new OneHandler();
        TwoHandler twoHandler = new TwoHandler();
        ThreeHandler threeHandler = new ThreeHandler();

        oneHandler.setHandler(twoHandler);
        twoHandler.setHandler(threeHandler);

        twoHandler.operation();
    }
}
