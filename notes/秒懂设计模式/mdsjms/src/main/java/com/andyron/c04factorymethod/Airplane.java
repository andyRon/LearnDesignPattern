package com.andyron.c04factorymethod;

public class Airplane extends Enemy {
    public Airplane(int x, int y) {
        // 调用父类构造方法初始化坐标
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制飞机于上层图层，出现坐标：" + x + "," + y);
        System.out.println("飞机想玩家发起攻击...");
    }
}
