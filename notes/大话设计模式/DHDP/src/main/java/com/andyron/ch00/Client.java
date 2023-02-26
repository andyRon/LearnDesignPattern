package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class Client {
    public static void main(String[] args) {


        Animal[] animals = new Animal[4];
        animals[0] = new Cat("小花");
        animals[1] = new Dog("小彩");
        animals[2] = new Cattle("小黑");
        animals[3] = new Sheep("小强");

        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i].shout());
        }

        System.out.println("=====");
        IChange[] arr = new IChange[2];
        arr[0] = new MachineCat("机器猫");
        arr[1] = new StoneMonkey("孙悟空");

        System.out.println(arr[0].changeThing("各种各样的东西"));
        System.out.println(arr[1].changeThing("各种各样的东西"));

    }
}
