package com.zhaoqi.设计模式.行为型.责任链模式Chain;

import com.zhaoqi.设计模式.行为型.责任链模式Chain.base.BaseHandler;

public class HandleB extends BaseHandler {
    public void handle() {
        System.out.println("handle B");
        //已经最后一个了

    }
}
