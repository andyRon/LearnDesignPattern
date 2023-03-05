package com.andyron.ch01.uml;

/**
 * @Author: andyron
 **/
public abstract class Animal {
    /**
     * 有生命
     */
    public String youshengming;

    /**
     * 新陈代谢
     */
    public  void metabolism(Oxygen oxygen, Water water) {
        System.out.println("新陈代谢");
    }

    /**
     * 繁殖
     */
    public abstract void fanzhi();

}
