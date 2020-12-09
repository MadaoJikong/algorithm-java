package com.jikong.design.behavior.memento;

/**
 * @author chengjunchao
 * @title: Original
 * @projectName algorithm-java
 * @description: 原始类
 * @date 2020/12/9 14:28
 */
public class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
