package com.zhaoqi.设计模式.创建型.单例;

/**
 * 线程安全
 * 效率低串行化
 */
public class Singleton3同步 {

    public static Singleton3同步 sync;


    public synchronized static Singleton3同步 get() {
        if (sync == null) {
            sync = new Singleton3同步();
        }
        return sync;
    }

}
