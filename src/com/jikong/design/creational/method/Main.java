package com.jikong.design.creational.method;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: Factory Method  工厂方法
 * @date 2020/12/7 10:49
 */
public class Main {
    public static void main(String[] args) {
        Factory s = new SmsSendFactory();
        s.produce().send();

        Factory m = new MailSendFactory();
        m.produce().send();
    }
}
