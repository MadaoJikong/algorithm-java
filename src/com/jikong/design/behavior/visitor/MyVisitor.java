package com.jikong.design.behavior.visitor;

/**
 * @author chengjunchao
 * @title: MyVisitor
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 15:24
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject：" + sub.getSubject());
    }
}
