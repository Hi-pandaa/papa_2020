package com.zhaoqi.设计模式.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhaoqi
 * @since 2020-03-09
 */
public class Sync1 {

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (new String("123")){
                System.out.println(Thread.currentThread().getId()+"获取锁");
                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized ("123"){
                System.out.println(Thread.currentThread().getId()+"获取锁");
                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        new CountDownLatch(1).await();
    }




}
