package com.zhaoqi.设计模式.结构型.适配器模式Adapter;

import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.BaseHandler;

public class HandlerB implements BaseHandler {
    public void handle() {
        System.out.println("handle B");
    }

    public void handleB() {
        System.out.println("my handle B");
    }
}
