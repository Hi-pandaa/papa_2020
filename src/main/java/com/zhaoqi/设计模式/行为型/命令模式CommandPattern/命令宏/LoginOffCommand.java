package com.zhaoqi.设计模式.行为型.命令模式CommandPattern.命令宏;

import com.zhaoqi.设计模式.行为型.命令模式CommandPattern.base.Command;
import com.zhaoqi.设计模式.行为型.命令模式CommandPattern.base.Light;

public class LoginOffCommand implements Command {
    private Light light;

    public LoginOffCommand(Light light) {
        this.light = light;
    }
    public void excute() {
        light.close();
        //其他命令
    }
}
