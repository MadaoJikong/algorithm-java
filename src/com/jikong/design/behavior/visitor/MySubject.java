package com.jikong.design.behavior.visitor;

/**
 * @author chengjunchao
 * @title: MySubject
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 15:26
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
