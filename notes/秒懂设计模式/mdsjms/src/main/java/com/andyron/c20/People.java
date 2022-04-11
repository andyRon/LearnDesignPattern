package com.andyron.c20;

public class People {

    private String name;
    private People other;

    public String getName() {
        return name;
    }

    public People(String name) {
        this.name = name;
    }

    public void connect(People other) {
        this.other = other;
    }

    public void talk(String msg) {
        other.listen(msg);
    }

    public void listen(String msg) {
        System.out.println(other.name + " 对 " + this.name + " 说： " + msg);
    }
}
