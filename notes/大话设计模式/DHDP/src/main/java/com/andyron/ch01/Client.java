package com.andyron.ch01;

/**
 * @Author: andyron
 **/
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("pow");
        System.out.println(operation.getResult(2, 10));
    }
}
