package com.zhaoqi.设计模式.行为型.策略模式Strategy;

import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.BasePostProcessor;
import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.StrategyA;

public class APostProcessor implements BasePostProcessor, StrategyA {
    public void proceed() {
        System.out.println("process a");
    }
}
