package com.jikong.design.behavior.state;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 状态模式 使用
 * @date 2020/12/9 15:00
 */
public class Main {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
