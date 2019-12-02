package com.zhaoqi.设计模式.创建型.抽象工厂AbstractFactory;

import com.zhaoqi.设计模式.创建型.抽象工厂AbstractFactory.base.BaseFactory;

public class FactoryA extends BaseFactory {
    public void invokeA() {
        System.out.println("invokeA");
    }

    public void invokeB() {
        System.out.println("invokeB");
    }

    //functionC提供默认实现

}
