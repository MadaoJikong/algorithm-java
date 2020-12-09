package com.jikong.design.behavior.mediator;

/**
 * @author chengjunchao
 * @title: User
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 17:24
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
