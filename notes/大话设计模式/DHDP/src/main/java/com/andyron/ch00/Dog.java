package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "汪";
    }
}
