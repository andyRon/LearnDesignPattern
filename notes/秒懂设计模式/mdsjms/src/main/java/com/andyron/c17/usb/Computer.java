package com.andyron.c17.usb;

public class Computer {
    private USB usb;

    public void setUSB(USB usb) {
        this.usb = usb;
    }

    public void compute() {
        usb.read();
    }
}
