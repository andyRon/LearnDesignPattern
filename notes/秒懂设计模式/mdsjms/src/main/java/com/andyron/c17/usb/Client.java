package com.andyron.c17.usb;

public class Client {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.setUSB(new KeyBoard());
        com.compute();

        com.setUSB(new Mouse());
        com.compute();

        com.setUSB(new Camera());
        com.compute();
    }
}
