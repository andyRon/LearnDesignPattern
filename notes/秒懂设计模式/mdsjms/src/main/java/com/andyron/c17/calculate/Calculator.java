package com.andyron.c17.calculate;

/**
 * 计算器类
 */
public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) { // 注入算法策略
        this.strategy = strategy;
    }

    public int getResult(int a, int b) {
        return this.strategy.calculate(a, b);
    }
}
