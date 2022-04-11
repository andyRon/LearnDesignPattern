package com.andyron.c21;

public class Client {
    public static void main(String[] args) {
        Switcher switcher = new Switcher(new Bulb());
        switcher.buttonPush();
        switcher.buttonPop();
    }
}
