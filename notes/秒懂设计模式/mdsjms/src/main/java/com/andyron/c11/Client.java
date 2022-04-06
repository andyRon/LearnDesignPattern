package com.andyron.c11;

public class Client {
    public static void main(String[] args) {
        //在地图第一行随便绘制一些图块
        new Tile("河流", 10, 10).draw();
        new Tile("河流", 10, 20).draw();
        new Tile("道路", 10, 30).draw();
        new Tile("草地", 10, 40).draw();
        new Tile("草地", 10, 50).draw();
        new Tile("草地", 10, 60).draw();
        new Tile("草地", 10, 70).draw();
        new Tile("草地", 10, 80).draw();
        new Tile("道路", 10, 90).draw();
        new Tile("道路", 10, 100).draw();
    }
}
