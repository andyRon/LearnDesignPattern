package com.andyron.c17.calculate;

/**
 * 算法策略接口
 */
public interface Strategy {
    /**
     *
     * @param a 操作数
     * @param b 被操作数
     * @return
     */
    public int calculate(int a, int b);
}
