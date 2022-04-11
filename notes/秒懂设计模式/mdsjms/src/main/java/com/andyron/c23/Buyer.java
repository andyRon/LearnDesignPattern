package com.andyron.c23;

/**
 * 买家类
 */
public abstract class Buyer {

    protected String name;

    public Buyer(String name) {
        this.name = name;
    }

    public abstract void inform(String product);
}
