package com.jikong.design.behavior.state;

/**
 * @author chengjunchao
 * @title: Context
 * @projectName algorithm-java
 * @description: 状态模式的切换类
 * @date 2020/12/9 14:59
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
