package com.jikong.design.behavior.mediator;

/**
 * @author chengjunchao
 * @title: User1
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 17:25
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
