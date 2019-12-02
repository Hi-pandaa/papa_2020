package com.zhaoqi.设计模式.创建型.简单工厂SimpleFactory;

import com.zhaoqi.设计模式.创建型.简单工厂SimpleFactory.base.BaseFactory;
import com.zhaoqi.设计模式.创建型.简单工厂SimpleFactory.base.BaseProduct;

public class FactoryDemo1  extends BaseFactory {
    public BaseProduct getProduct(String name) {
        if("A".equalsIgnoreCase(name)){
            return  new ProductA();
        }else if("B".equalsIgnoreCase(name)){
            return new ProductB();
        }

        return null;
    }
}
