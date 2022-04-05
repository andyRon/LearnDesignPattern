package com.andyron.c05;

/**
 * 兵种抽象类
 */
public abstract class Unit {
    // 攻击力
    protected int attack;
    // 防御力
    protected int defence;
    // 生命力
    protected int health;
    protected int x;
    protected int y;

    public Unit(int attack, int defence, int health, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    /**
     * 绘制到地图上
     */
    public abstract void show();

    public abstract void attack();
}
