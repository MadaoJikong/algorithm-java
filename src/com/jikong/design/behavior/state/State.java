package com.jikong.design.behavior.state;

/**
 * @author chengjunchao
 * @title: State
 * @projectName algorithm-java
 * @description: 状态类
 * @date 2020/12/9 14:57
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
