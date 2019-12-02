package com.zhaoqi.设计模式.创建型.单例;

/**
 * 线程安全
 * 空间占用度高
 */
public class Singleton1懒汉式 {


    public static Singleton1懒汉式 lazy = new Singleton1懒汉式();

    public static Singleton1懒汉式 get() {
        return lazy;
    }

}
