package com.zhaoqi.设计模式.创建型.原型模式Prototype;

public class Test1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        MyPrototype p1 = new MyPrototype("1");
        Prototype v = p1.clone();



    }
}
