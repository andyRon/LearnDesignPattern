package com.andyron.c05;

/***
 * 猛犸类
 */
public class Mammoth extends HighClassUnit {

    public Mammoth(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸巨兽出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("猛犸巨兽用獠牙顶，攻击力：" + attack);
    }
}
