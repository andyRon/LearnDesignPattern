package com.andyron.c11;

/**
 * 图块类
 */
public class Tile {
    /**
     * 图块所用的材质图
     */
    private String image;
    /**
     * 图块所在坐标
     */
    private int x, y;

    public Tile(String image, int x, int y) {
        this.image = image;
        System.out.print("从磁盘加载[" + image + "]图片，耗时半秒...");
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }
}
