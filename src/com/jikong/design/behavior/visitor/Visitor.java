package com.jikong.design.behavior.visitor;

/**
 * @author chengjunchao
 * @title: Visitor
 * @projectName algorithm-java
 * @description: 要访问的对象
 * @date 2020/12/9 15:23
 */
public interface Visitor {
    void visit(Subject sub);
}
