package com.zhaoqi.jvm;

/**
 * @author zhaoqi
 * @since 2020-03-05
 */
public class SyncBlockTest {


    public synchronized  void test(){
        System.out.println("hahahahah");
    }



    public void test2(){
        synchronized (this){
            System.out.println("hahahah");
        }
    }

    public static void main(String[] args) {

    }
}
