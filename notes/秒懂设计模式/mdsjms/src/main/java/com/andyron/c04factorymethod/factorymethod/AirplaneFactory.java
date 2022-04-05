package com.andyron.c04factorymethod.factorymethod;

import com.andyron.c04factorymethod.Airplane;
import com.andyron.c04factorymethod.Enemy;

import java.util.Random;

public class AirplaneFactory implements Factory{

    @Override
    public Enemy create(int screenWidth) {
        Random rnd = new Random();
        return new Airplane(rnd.nextInt(screenWidth), 0);
    }
}
