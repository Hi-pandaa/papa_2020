package com.zhaoqi.设计模式.创建型.单例;

/**
 * 静态内部类的静态属性
 * 因为JVM的加载机制的原因 在没有使用到这个类的时候不会被加载  所以也是懒加载
 * 线程安全 且没有指令重排的关系
 */
public class Singleton6内部类 {

    public static Singleton6内部类 get() {
        return InnerClass.inner;
    }


    /**
     * 静态内部类
     */
    public static class InnerClass {

        private static final Singleton6内部类 inner = new Singleton6内部类();
    }
}
