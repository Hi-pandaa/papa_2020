package com.zhaoqi.设计模式.创建型.原型模式Prototype;

/**
 * 原型基类
 */
public abstract class  Prototype implements  Cloneable {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public Prototype clone() throws CloneNotSupportedException {

        return (Prototype) super.clone();
    }


}
