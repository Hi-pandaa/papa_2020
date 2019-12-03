package com.zhaoqi.设计模式.行为型.责任链模式Chain.base;

public abstract class BaseHandler {


    private BaseHandler nextHandler;

    public int order = 0;

     public  abstract void handle();

    public BaseHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

