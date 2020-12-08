package com.jikong.design.creational.method;

/**
 * @author chengjunchao
 * @title: MailSender
 * @projectName algorithm-java
 * @description: MailSender
 * @date 2020/12/7 10:44
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("邮件发送");
    }
}
