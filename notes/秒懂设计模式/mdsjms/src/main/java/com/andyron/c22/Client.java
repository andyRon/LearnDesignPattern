package com.andyron.c22;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Candy candy = new Candy("小兔奶糖", LocalDate.of(2019, 10, 1), 20.00f);
        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2020, 1, 1));
        discountVisitor.visit(candy);
    }
}
