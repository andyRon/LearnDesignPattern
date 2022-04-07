package com.andyron.c13;

/**
 * 画笔抽象类
 */
public abstract class Pen {

    public abstract void getColor();

    public void draw() {
        getColor();
        System.out.print("△");
    }
}
