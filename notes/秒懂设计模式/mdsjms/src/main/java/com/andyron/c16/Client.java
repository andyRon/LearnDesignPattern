package com.andyron.c16;

public class Client {
    public static void main(String[] args) {
        int amount = 10000;
        Staff staff = new Staff("张三");
        if (!staff.approve(amount)) {
            Manager manager = new Manager("李四");
            if (!manager.approve(amount)) {
                CFO cfo = new CFO("王五");
                cfo.approve(amount);
            }
        }
    }
}
