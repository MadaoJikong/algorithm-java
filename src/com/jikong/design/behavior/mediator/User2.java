package com.jikong.design.behavior.mediator;

/**
 * @author chengjunchao
 * @title: User2
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 17:26
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
