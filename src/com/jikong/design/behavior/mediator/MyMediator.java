package com.jikong.design.behavior.mediator;

/**
 * @author chengjunchao
 * @title: MyMediator
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 17:24
 */
public class MyMediator implements Mediator {
    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
