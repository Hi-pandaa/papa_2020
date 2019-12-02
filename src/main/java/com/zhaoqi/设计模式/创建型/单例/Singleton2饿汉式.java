package com.zhaoqi.设计模式.创建型.单例;

/**
 * 线程不安全
 *
 */
public class Singleton2饿汉式 {

    public static Singleton2饿汉式 hungry;

    public static Singleton2饿汉式 get() {

        if (hungry == null) {
            hungry = new Singleton2饿汉式();
        }
        return hungry;
    }


}
