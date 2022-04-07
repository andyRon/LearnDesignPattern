package com.andyron.c14.mammal;

public class Bat extends Mammal {

    @Override
    public void move() {
        System.out.print("蝙蝠在空中飞...");
    }

    @Override
    public void eat() {
        System.out.println("抓蚊子吃。");
    }
}
