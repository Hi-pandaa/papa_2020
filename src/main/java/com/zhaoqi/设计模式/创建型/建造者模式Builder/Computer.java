package com.zhaoqi.设计模式.创建型.建造者模式Builder;

public class Computer {

    private String CPU;

    private String memory;

    private String mouse;


    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
