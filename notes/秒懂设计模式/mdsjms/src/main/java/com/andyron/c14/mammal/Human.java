package com.andyron.c14.mammal;

public class Human extends Mammal{

    @Override
    public void move() {
        System.out.print("人类在路上开着车...");
    }

    @Override
    public void eat() {
        System.out.println("去公司挣钱、吃饭。");
    }
}
