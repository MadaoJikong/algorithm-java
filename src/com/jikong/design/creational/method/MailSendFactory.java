package com.jikong.design.creational.method;

/**
 * @author chengjunchao
 * @title: MainSendFactory
 * @projectName algorithm-java
 * @description: 邮件发送工厂
 * @date 2020/12/7 10:48
 */
public class MailSendFactory implements Factory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
