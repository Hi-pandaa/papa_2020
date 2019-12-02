package com.zhaoqi.设计模式.创建型.建造者模式Builder;

public class ComputerBuilder {

    private Computer computer;//需要建造的对象


    /**
     * 生成建造类 创建要建造的对象类
     *
     * @return
     */
    public static ComputerBuilder genericComputer() {
        return new ComputerBuilder(new Computer());
    }

    private ComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    public ComputerBuilder cpu(String name) {
        computer.setCPU(name);
        return this;
    }

    public ComputerBuilder memory(String name) {
        computer.setMemory(name);
        return this;
    }

    public ComputerBuilder mouse(String name) {
        computer.setMouse(name);
        return this;
    }

    public Computer build() {
        return this.computer;
    }

}
