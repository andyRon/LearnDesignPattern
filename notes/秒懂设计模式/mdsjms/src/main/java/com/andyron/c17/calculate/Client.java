package com.andyron.c17.calculate;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Addition());
        System.out.println(calculator.getResult(1, 2));

        calculator.setStrategy(new Subtraction());
        System.out.println(calculator.getResult(3, 1));
    }
}
