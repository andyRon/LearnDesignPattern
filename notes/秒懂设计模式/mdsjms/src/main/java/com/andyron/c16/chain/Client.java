package com.andyron.c16.chain;

public class Client {
    public static void main(String[] args) {
        Approver flightJohn = new Staff("张飞");

        flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CFO("刘备"));

//        flightJohn.approve(1000);
//        flightJohn.approve(4000);
//        flightJohn.approve(9000);
        flightJohn.approve(30000);
    }
}
