package com.jikong.design.behavior.memento;

/**
 * @author chengjunchao
 * @title: Memento
 * @projectName algorithm-java
 * @description: 备忘录类
 * @date 2020/12/9 14:29
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
