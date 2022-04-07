package com.andyron.c13.bridge;

/**
 * 正方形尺子类
 */
public class SquareRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("□");
    }
}
