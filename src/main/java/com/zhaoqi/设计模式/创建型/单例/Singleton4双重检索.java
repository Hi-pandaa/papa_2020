package com.zhaoqi.设计模式.创建型.单例;

/**
 * 线程大部分时间安全
 * 效率比较高 但是在第一进入的时候还是会有同步的情况
 * 但是会存在指令重排问题 小概率导致线程不安全
 *
 */
public class Singleton4双重检索 {

    public static Singleton4双重检索 doubleCheck;


    public static Singleton4双重检索 get(){
         if(doubleCheck==null){
             synchronized (Singleton4双重检索.class){
                 if(doubleCheck==null){
                     doubleCheck=new Singleton4双重检索();
                 }
             }
         }
        return doubleCheck;
    }
}
