package com.jikong.design.creational.simple;

/**
 * @author chengjunchao
 * @title: MailSender
 * @projectName algorithm-java
 * @description: 邮件发送
 * @date 2020/12/7 10:23
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("邮件发送");
    }
}
