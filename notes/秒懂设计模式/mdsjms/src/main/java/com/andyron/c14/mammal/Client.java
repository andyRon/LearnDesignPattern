package com.andyron.c14.mammal;

public class Client {
    public static void main(String[] args) {
        Mammal mammal = new Bat();
        mammal.live();

        mammal = new Whale();
        mammal.live();

        mammal = new Human();
        mammal.live();
    }
}
