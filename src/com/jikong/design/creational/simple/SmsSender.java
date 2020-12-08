package com.jikong.design.creational.simple;

/**
 * @author chengjunchao
 * @title: SmsSender
 * @projectName algorithm-java
 * @description: 短信发送
 * @date 2020/12/7 10:23
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
