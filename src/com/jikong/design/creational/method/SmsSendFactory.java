package com.jikong.design.creational.method;

/**
 * @author chengjunchao
 * @title: SmsSendFactory
 * @projectName algorithm-java
 * @description: 短信发送工厂
 * @date 2020/12/7 10:47
 */
public class SmsSendFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
