package com.jikong.design.behavior.mediator;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 17:29
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
