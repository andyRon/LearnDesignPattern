package com.andyron.c13.bridge;

/**
 * 圆形尺子类
 */
public class CircleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("○");
    }
}
