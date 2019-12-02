package com.zhaoqi.设计模式.创建型.简单工厂SimpleFactory;

import com.zhaoqi.设计模式.创建型.简单工厂SimpleFactory.base.BaseProduct;

public class ProductA  extends BaseProduct {
    protected String returnName() {
        return "A";
    }
}
