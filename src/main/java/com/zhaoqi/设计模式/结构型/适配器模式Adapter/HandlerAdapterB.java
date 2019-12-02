package com.zhaoqi.设计模式.结构型.适配器模式Adapter;

import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.BaseHandler;
import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.HandlerAdapter;

public class HandlerAdapterB implements HandlerAdapter {
    public boolean support(BaseHandler handler) {
        return handler instanceof HandlerB;
    }

    public void invoke(BaseHandler handler) {
        HandlerB handlerB = (HandlerB) handler;
        handlerB.handle();
        handlerB.handleB();
    }
}
