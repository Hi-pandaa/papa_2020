package com.zhaoqi.设计模式.结构型.代理模式Proxy;

public class UserImpl implements User {
    @Override
    public String invoke() {
        System.out.println("invoke");
        return "ok";
    }
}
