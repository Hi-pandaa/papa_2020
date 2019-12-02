package com.zhaoqi.设计模式.结构型.适配器模式Adapter;

import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.BaseHandler;

public class HandlerA implements BaseHandler {
    public void handle() {
        System.out.println("invoke A");
    }

    public void handleA(){
        System.out.println("my invoke A");
    }
}
