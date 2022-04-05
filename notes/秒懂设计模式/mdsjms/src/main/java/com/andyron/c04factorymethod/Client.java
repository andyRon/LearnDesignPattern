package com.andyron.c04factorymethod;

import com.andyron.c04factorymethod.factorymethod.AirplaneFactory;
import com.andyron.c04factorymethod.factorymethod.BossFactory;
import com.andyron.c04factorymethod.factorymethod.Factory;
import com.andyron.c04factorymethod.factorymethod.TankFactory;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
//        c1();
//        c2();
        c3();
    }


    /**
     * 普通调用方式
     */
    static void c1() {
        int screenWidth = 100;
        System.out.println("游戏开始");
        Random random = new Random();
        // 随机生成敌机横坐标
        int x = random.nextInt(screenWidth);
        Airplane airplane = new Airplane(x, 0);
        // 显示飞机
        airplane.show();

        x = random.nextInt(screenWidth);
        Tank tank = new Tank(x, 0);
        tank.show();
    }

    /**
     * 简单工厂调用
     */
    static void c2() {
        System.out.println("游戏开始（简单工厂）");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("Airplane").show();
        factory.create("Tank").show();
    }

    /**
     * 工厂方法调用
     */
    static void c3() {
        int screenWidth = 100;
        System.out.println("游戏开始");

        Factory factory = new TankFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }

        factory = new AirplaneFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }

        System.out.println("-----抵达关底，打boss-----");
        factory = new BossFactory();
        factory.create(screenWidth).show();

    }
}
