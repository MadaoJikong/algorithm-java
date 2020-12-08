package com.jikong.design.creational.method;

/**
 * @author chengjunchao
 * @title: SmsSender
 * @projectName algorithm-java
 * @description: SmsSender
 * @date 2020/12/7 10:44
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
