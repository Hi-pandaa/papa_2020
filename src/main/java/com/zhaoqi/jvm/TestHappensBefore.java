package com.zhaoqi.jvm;

/**
 * @author zhaoqi
 * @since 2020-03-05
 */
public class TestHappensBefore {

    static volatile int value;

    public static void main(String args[]) {


        new Thread(() -> {
            System.out.println("");
            value++;

        }).start();

        new Thread(() -> {
            System.out.println("");
            value++;

        }).start();


        new Thread(() -> {
            System.out.println("");
            value--;

        }).start();

    }


}
