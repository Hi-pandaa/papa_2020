package com.zhaoqi.设计模式.创建型.抽象工厂AbstractFactory.base;

public abstract class BaseFactory implements FunctionA,FunctionB,FunctionC {

    public void invokeC() {
        System.out.println("抽象基类工厂提供默认实现");
    }
}
