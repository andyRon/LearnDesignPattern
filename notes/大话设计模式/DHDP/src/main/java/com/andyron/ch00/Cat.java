package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class Cat extends Animal{

    public Cat() {
        super();
    }
    public Cat(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "喵";
    }
}
