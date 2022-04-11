package com.andyron.c20;

public class Client {
    public static void main(String[] args) {
        People p3 = new People("张三");
        People p4 = new People("李四");

        p3.connect(p4);
        p4.connect(p3);

        p3.talk("你好！");
        p4.talk("早上好！阿三！");
    }
}
