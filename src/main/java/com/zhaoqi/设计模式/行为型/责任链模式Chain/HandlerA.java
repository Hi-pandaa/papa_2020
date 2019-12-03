package com.zhaoqi.设计模式.行为型.责任链模式Chain;

import com.zhaoqi.设计模式.行为型.责任链模式Chain.base.BaseHandler;

public class HandlerA extends BaseHandler {

    public void handle() {
        System.out.println("handleA");
        BaseHandler nextHandler = super.getNextHandler();
        nextHandler.handle();
    }
}
