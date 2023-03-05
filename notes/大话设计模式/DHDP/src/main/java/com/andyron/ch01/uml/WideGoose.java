package com.andyron.ch01.uml;

/**
 * 大雁
 * @Author: andyron
 **/
public class WideGoose extends Bird implements IFly {

    @Override
    public void fly() {
        System.out.println("飞行");
    }
}
