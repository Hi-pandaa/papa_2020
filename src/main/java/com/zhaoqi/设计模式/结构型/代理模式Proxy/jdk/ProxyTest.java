package com.zhaoqi.设计模式.结构型.代理模式Proxy.jdk;

import com.zhaoqi.设计模式.结构型.代理模式Proxy.User;
import com.zhaoqi.设计模式.结构型.代理模式Proxy.UserImpl;

import java.lang.reflect.Proxy;

public class ProxyTest {


    public static void main(String[] args) {

        User user = new UserImpl();//被代理的目标类


        //原则上 这个user应该是要入参 而不是子接调用的
        User proxyUser = (User)Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), user.getClass().getInterfaces(), (proxy, method, args1) -> {
            System.out.println("proxy start");
            user.invoke();
            System.out.println("proxy end");
            return "";
        });

        proxyUser.invoke();


    }
}
