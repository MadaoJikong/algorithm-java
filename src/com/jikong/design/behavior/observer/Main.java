package com.jikong.design.behavior.observer;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 观察者模式 使用者
 * @date 2020/12/9 11:25
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Subject subject = new MySubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        subject.add(observer1);
        subject.add(observer2);
        subject.operation();
    }
}
