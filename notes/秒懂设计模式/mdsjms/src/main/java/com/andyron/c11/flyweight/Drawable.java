package com.andyron.c11.flyweight;

/**
 * 绘图接口
 */
public interface Drawable {

    /**
     * 绘图方法，接受地图坐标
     */
    void draw(int x, int y);
}
