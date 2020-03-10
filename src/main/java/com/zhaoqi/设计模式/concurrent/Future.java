package com.zhaoqi.设计模式.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhaoqi
 * @since 2020-01-13
 */
public class Future {

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

    static Random random = new Random();

    public static void main1(String[] args) throws ExecutionException, InterruptedException {

        List<java.util.concurrent.Future<Integer>> tasks = new ArrayList<java.util.concurrent.Future<Integer>>(12);

        CountDownLatch cl = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            tasks.add(executor.submit(() -> {

                //do something
                int i1 = random.nextInt(10);
                System.out.println("threadid=" + Thread.currentThread().getId() + "====int=" + i1);
                Thread.sleep(i1);
                cl.countDown();
                return i1;
            }));
        }

        //1.每个futuretask都阻塞等待结果  get()
        //plan a 可以所有线程开启就开始收集信息 但是每个都会自己阻塞 等于是每个都要有了结果才可以

        //plan b 可以等待所有的线程都执行完再开始统计 cl.await()  可以选择 部分线程执行完计算 就开始统计
        cl.await();

        for (int i = 0; i < tasks.size(); i++) {
            //线程阻塞 等待结果

            java.util.concurrent.Future<Integer> future = tasks.get(i);
            System.out.println(future.get());
        }

    }

    static ReentrantLock lock = new ReentrantLock();
    static Condition condition;



    public static void main(String[] args) {
         condition= lock.newCondition();

        new Thread(() -> {

            try {
                lock.lock();
                condition.await();
                System.out.println("1234");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {

            try {
                Thread.sleep(4000);
                lock.lock();
                condition.signal();
                lock.unlock();
                System.out.println("唤醒成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
