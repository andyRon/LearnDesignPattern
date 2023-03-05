package com.andyron.ch01;

/**
 * @Author: andyron
 **/
public class Pow extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return Math.pow(numberA, numberB);
    }
}
