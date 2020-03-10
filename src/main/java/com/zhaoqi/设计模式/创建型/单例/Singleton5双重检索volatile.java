package com.zhaoqi.设计模式.创建型.单例;
/**
 * 线程安全
 * 效率比较高 但是在第一进入的时候还是会有同步的情况
 *
 * 使用了volatile 就对线程可见
 *
 * 而且有了 volatile 在JDK1.5以后的保证的happens-before的保证
 *
 *因为对象的创建也不完全是一个原子性的操作
 *
 *
 */
public class Singleton5双重检索volatile {

    public  static volatile Singleton5双重检索volatile volatileDoubleCheck;


    public static Singleton5双重检索volatile get(){
        if(volatileDoubleCheck==null){
            synchronized (Singleton4双重检索.class){
                if(volatileDoubleCheck==null){
                    volatileDoubleCheck=new Singleton5双重检索volatile();
                }
            }
        }
        return volatileDoubleCheck;
    }
}
