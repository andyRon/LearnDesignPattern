package com.andyron.c05;

/**
 * 具体的兵种类：巨型战舰类
 */
public class Battleship extends HighClassUnit{

    public Battleship(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("战舰用激光炮打击，攻击力：" + attack);
    }
}
