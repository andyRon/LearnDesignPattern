package com.andyron.c03prototype;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        ArrayList<EnemyPlane> enemyPlanes = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
            enemyPlanes.add(ep);
        }
    }
}
