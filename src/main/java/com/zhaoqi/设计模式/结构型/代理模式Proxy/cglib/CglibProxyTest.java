package com.zhaoqi.设计模式.结构型.代理模式Proxy.cglib;

import com.zhaoqi.设计模式.结构型.代理模式Proxy.UserImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyTest {


    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");

        final Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(UserImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                System.out.println("start proxy");
                methodProxy.invokeSuper(o, objects);//被代理类的方法
                System.out.println("end proxy");
                return "";
            }
        });
        UserImpl proxy =(UserImpl) enhancer.create();
        proxy.invoke();


    }
}
