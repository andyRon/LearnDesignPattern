package com.andyron.c23;

/**
 * 海淘买家类
 */
public class HandChopper extends Buyer {
    public HandChopper(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        System.out.print(name);
        System.out.println("购买：" + product);
    }
}
