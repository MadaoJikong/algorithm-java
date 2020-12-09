package com.jikong.design.behavior.memento;

/**
 * @author chengjunchao
 * @title: Storage
 * @projectName algorithm-java
 * @description: 存储备忘录
 * @date 2020/12/9 14:33
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
