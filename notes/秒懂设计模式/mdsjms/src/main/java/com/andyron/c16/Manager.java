package com.andyron.c16;

/**
 * 财务经理类
 */
public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 5000) {
            System.out.println("审核通过。【经理：" + name + "】");
            return true;
        } else {
            System.out.println("无权审核，请找上级。【经理：" + name + "】");
            return false;
        }
    }
}
