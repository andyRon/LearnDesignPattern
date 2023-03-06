package com.andyron.c09.decorator;

import com.andyron.c09.Showable;

/**
 * 装饰器抽象类
 * 抽象主要为了不允许用户直接实例化此类。
 * show具体装饰给子类的某个化妆品类的
 */
public abstract class Decorator implements Showable {
    protected Showable showable;

    /**
     * 构造时注入被装饰者
     */
    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        // 直接调用不加任何装饰
        showable.show();
    }
}
