package com.andyron.c05;

/**
 * 具体的兵种类：变形坦克类
 */
public class Tank extends MidClassUnit{

    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("坦克出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("坦克用炮轰击，攻击力：" + attack);

    }
}
