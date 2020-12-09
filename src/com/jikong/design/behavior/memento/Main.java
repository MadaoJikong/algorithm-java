package com.jikong.design.behavior.memento;

/**
 * @author chengjunchao
 * @title: Main
 * @projectName algorithm-java
 * @description: 备忘录使用者
 * @date 2020/12/9 14:39
 */
public class Main {
    public static void main(String[] args) {
        // 创建原始类
        Original origi = new Original("egg");

        // 创建备忘录 并传入 Storage。
        Storage storage = new Storage(origi.createMemento());


        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }
}
