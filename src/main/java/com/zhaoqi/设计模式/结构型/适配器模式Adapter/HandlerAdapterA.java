package com.zhaoqi.设计模式.结构型.适配器模式Adapter;

import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.BaseHandler;
import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.HandlerAdapter;

/**
 * 这个适配器 实现了适配器的接口 但是
 * 在具体的调用中使用的是目标的类独有的方法
 * 但是对外提供的确实invoke这个公共的接口方法
 * 所以叫做适配
 *
 * =====================
 *
 */
public class HandlerAdapterA implements HandlerAdapter {
    public boolean support(BaseHandler handler) {
       return  handler instanceof HandlerA;
    }

    public void invoke(BaseHandler handler) {
        HandlerA handle = (HandlerA) handler;
        handle.handle();
        handle.handleA();
    }
}
