package com.zhaoqi.设计模式.行为型.策略模式Strategy;

import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.BasePostProcessor;
import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.StrategyB;

public class BPostProcessor implements BasePostProcessor, StrategyB {
    public void proceed() {
        System.out.println("process b");
    }
}
