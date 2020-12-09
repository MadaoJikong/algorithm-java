package com.jikong.design.behavior.visitor;

/**
 * @author chengjunchao
 * @title: Subject
 * @projectName algorithm-java
 * @description: Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
 * @date 2020/12/9 15:24
 */
public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}
