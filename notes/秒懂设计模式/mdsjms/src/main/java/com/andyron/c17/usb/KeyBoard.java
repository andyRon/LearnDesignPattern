package com.andyron.c17.usb;

public class KeyBoard implements USB {
    @Override
    public void read() {
        System.out.println("键盘指令数据...");
    }
}
