package com.zhaoqi.设计模式.结构型.适配器模式Adapter;

import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.BaseHandler;
import com.zhaoqi.设计模式.结构型.适配器模式Adapter.base.HandlerAdapter;

import java.util.LinkedList;
import java.util.List;

public class Dispather {

    private static List<HandlerAdapter> adapters=  new LinkedList<>();

    static {
        adapters.add(new HandlerAdapterA());
        adapters.add(new HandlerAdapterB());
    }


    public static void dispather(BaseHandler handler){

        for (HandlerAdapter adapter : adapters) {
            if(adapter.support(handler)){
                adapter.invoke(handler);
            }
        }
    }




}
