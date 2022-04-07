package com.andyron.c17.calculate;

/**
 * 加法策略类
 */
public class Subtraction implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
