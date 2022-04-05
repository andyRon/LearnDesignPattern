package com.andyron.c04factorymethod.factorymethod;

import com.andyron.c04factorymethod.Enemy;
import com.andyron.c04factorymethod.Tank;

import java.util.Random;

public class TankFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        Random rnd = new Random();
        return new Tank(rnd.nextInt(screenWidth), 0);
    }
}
