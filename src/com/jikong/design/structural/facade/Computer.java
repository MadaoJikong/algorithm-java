package com.jikong.design.structural.facade;

/**
 * @author chengjunchao
 * @title: Computer
 * @projectName algorithm-java
 * @description:
 * @date 2020/12/8 14:31
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
    }

    public void start() {
        System.out.println("start the computer!");
        cpu.start();
        memory.start();
        System.out.println("start computer finished!");
    }

    public void shutdown() {
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        System.out.println("computer closed!");
    }
}
