package com.zhaoqi.设计模式.行为型.策略模式Strategy;

import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.BasePostProcessor;
import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.StrategyA;
import com.zhaoqi.设计模式.行为型.策略模式Strategy.base.StrategyB;

import java.util.LinkedList;
import java.util.List;

public class Test {


    private static List<BasePostProcessor> processors = new LinkedList<>();

    static {
        processors.add(new APostProcessor());
        processors.add(new BPostProcessor());
    }

    public static void main(String[] args) {

        List<BasePostProcessor> AStratergy = new LinkedList<>();
        List<BasePostProcessor> BStratergy = new LinkedList<>();
        for (BasePostProcessor processor : processors) {
            if (processor instanceof StrategyA) {
                AStratergy.add(processor);
            }
            if (processor instanceof StrategyB) {
                BStratergy.add(processor);
            }
            invoke(AStratergy);
            invoke(BStratergy);
        }
    }

    public static void invoke(List<BasePostProcessor> processors) {
        for (BasePostProcessor processor : processors) {
            processor.proceed();
        }
    }
}
