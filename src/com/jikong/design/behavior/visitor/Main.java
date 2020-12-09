package com.jikong.design.behavior.visitor;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/9 15:26
 */
public class Main {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
