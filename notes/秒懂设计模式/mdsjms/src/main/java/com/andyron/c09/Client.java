package com.andyron.c09;

public class Client {
    public static void main(String[] args) {
        new Decorator(new Girl()).show();
    }
}
