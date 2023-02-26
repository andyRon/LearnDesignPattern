package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class Sheep extends Animal {
    public Sheep() {
        super();
    }

    public Sheep(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "咩";
    }
}
