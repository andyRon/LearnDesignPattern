package com.andyron.c04factorymethod;

import java.util.Random;

public class SimpleFactory {
    private int screenWidth;
    private Random rnd;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.rnd = new Random();
    }

    public Enemy create(String type) {
        int x = rnd.nextInt(screenWidth);
        Enemy enemy = null;
        switch (type) {
            case "Airplane":
                enemy = new Airplane(x, 0);
                break;
            case "Tank":
                enemy = new Tank(x, 0);
                break;
        }
        return enemy;
    }
}
