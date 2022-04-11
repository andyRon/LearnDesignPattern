package com.andyron.c21.command;

import com.andyron.c21.Bulb;

public class Client {
    public static void main(String[] args) {
        // 命令请求方
        Switcher switcher = new Switcher();
        // 命令执行方
        Bulb bulb = new Bulb();
        // 开关命令
        SwitchCommand switchCommand = new SwitchCommand(bulb);

        // 为开关绑定开关命令
        switcher.setCommand(switchCommand);
        switcher.buttonPush();
        switcher.buttonPop();
    }
}
