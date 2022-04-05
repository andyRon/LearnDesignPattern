package com.andyron.c04factorymethod.factorymethod;

import com.andyron.c04factorymethod.Enemy;

public class BossFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        // 让BOSS出现在屏幕中央
        return new Boss(screenWidth/2, 0);
    }
}
