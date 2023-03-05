package com.andyron.ch01.uml;

/**
 * @Author: andyron
 **/
public class DonaldDuck extends Duck implements ILanguage {
    @Override
    public void speak() {
        System.out.println("唐老鸭讲话");
    }
}
