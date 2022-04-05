package com.andyron.c04factorymethod;

/**
 * 敌人抽象类
 */
public abstract class Enemy {
    protected int x;
    protected int y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 抽象方法，在地图上绘制
     */
    public abstract void show();
}
