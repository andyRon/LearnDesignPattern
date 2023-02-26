package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public abstract class Animal {
    protected String name = "";

    public Animal() {
        this.name = "无名";
    }

    public Animal(String name) {
        this.name = name;
    }

    protected int shoutNum = 3;

    public int getShoutNum() {
        return shoutNum;
    }

    public void setShoutNum(int shoutNum) {
        if (shoutNum <= 10) {
            this.shoutNum = shoutNum;
        } else {
            this.shoutNum = 10;
        }
    }

    public String shout() {
        String res = "";
        for (int i = 0; i < shoutNum; i++) {
            res += getShoutSound();
        }
        return "我的名字叫" + name + " " + res;
    }

    protected abstract String getShoutSound();
}
