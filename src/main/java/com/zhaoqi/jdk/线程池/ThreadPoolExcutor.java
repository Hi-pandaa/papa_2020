package com.zhaoqi.jdk.线程池;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhaoqi
 * @since 2020-03-04
 */
public class ThreadPoolExcutor {

    public static ThreadPoolExecutor t =
            new ThreadPoolExecutor(2, 20, 20,
                    TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));

    public static void main(String[] args) throws ExecutionException, InterruptedException {

     Future<Object> future1= t.submit(new Callable<Object>() {

            /**
             * Computes a result, or throws an exception if unable to do so.
             *
             * @return computed result
             * @throws Exception if unable to compute a result
             */
            @Override
            public Object call() throws Exception {

                System.out.println("---------线程"+Thread.currentThread().getId()+"执行开始");
                Thread.sleep(20000);

                System.out.println("---------线程"+Thread.currentThread().getId()+"执行完成");
                return Integer.MAX_VALUE;
            }
        });




    }

}
