package com.andyron.c21;

/**
 * 开关类
 */
public class Switcher {

    private Bulb bulb;

    public Switcher(Bulb bulb) {
        this.bulb = bulb;
    }

    public void buttonPush() {
        System.out.println("按下按钮...");
        bulb.on();
    }

    public void buttonPop() {
        System.out.println("弹起按钮...");
        bulb.off();
    }
}
