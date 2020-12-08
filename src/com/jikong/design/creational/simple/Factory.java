package com.jikong.design.creational.simple;

/**
 * @author chengjunchao
 * @title: 简单工厂
 * @projectName algorithm-java
 * @description: 简单工厂
 * @date 2020/12/7 10:21
 */
public class Factory {
    public Sender createSms() {
        return new SmsSender();
    }

    public Sender createMail() {
        return new MailSender();
    }
}
