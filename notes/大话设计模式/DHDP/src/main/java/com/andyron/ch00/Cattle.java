package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class Cattle extends Animal {
    public Cattle() {
        super();
    }

    public Cattle(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "哞";
    }
}
