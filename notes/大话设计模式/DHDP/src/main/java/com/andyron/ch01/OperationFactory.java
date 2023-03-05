package com.andyron.ch01;

/**
 * @Author: andyron
 **/
public class OperationFactory {
    public static Operation createOperation(String o) {
        Operation oper = null;
        switch (o) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Div();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
            case "pow":
                oper = new Pow();
                break;
        }
        return oper;
    }
}
