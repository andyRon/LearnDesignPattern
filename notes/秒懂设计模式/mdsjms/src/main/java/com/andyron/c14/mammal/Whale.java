package com.andyron.c14.mammal;

public class Whale extends Mammal {

    @Override
    public void move() {
        System.out.print("鲸🐳在水里游着...");
    }

    @Override
    public void eat() {
        System.out.println("捕鱼吃...");
    }

}
