package com.andyron.c04factorymethod.factorymethod;

import com.andyron.c04factorymethod.Enemy;

public interface Factory {
    Enemy create(int screenWidth);
}
