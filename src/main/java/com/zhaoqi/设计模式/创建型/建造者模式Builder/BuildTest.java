package com.zhaoqi.设计模式.创建型.建造者模式Builder;

public class BuildTest  {
    public static void main(String[] args) {

        Computer c1 = ComputerBuilder.genericComputer().cpu("").memory("").mouse("").build();
    }
}
