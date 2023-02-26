package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class Monkey extends Animal {
    public Monkey() {
        super();
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "吼";
    }
}
