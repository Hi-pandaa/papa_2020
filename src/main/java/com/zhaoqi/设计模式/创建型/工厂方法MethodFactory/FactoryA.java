package com.zhaoqi.设计模式.创建型.工厂方法MethodFactory;

import com.zhaoqi.设计模式.创建型.工厂方法MethodFactory.base.BaseFactory;
import com.zhaoqi.设计模式.创建型.工厂方法MethodFactory.base.BaseProduct;

public class FactoryA extends BaseFactory {
    public BaseProduct create() {
        return new ProductA();
    }
}
