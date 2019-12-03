package com.zhaoqi.设计模式.行为型.命令模式CommandPattern.命令宏;

import com.zhaoqi.设计模式.行为型.命令模式CommandPattern.base.Command;
import com.zhaoqi.设计模式.行为型.命令模式CommandPattern.base.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    public void excute() {
        //这里是具体的命令 但是不能直接执行  需要灯这个对象自己去执行开关操作
        light.on();
        //其他命令
    }
}
