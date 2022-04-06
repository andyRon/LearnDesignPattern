package com.andyron.c09;

/**
 * 化妆品装饰器类
 */
public class Decorator implements Showable {

    Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        // 化妆品粉饰开始
        System.out.print("粉饰【");
        // 被装饰者的原生展示
        showable.show();
        // 粉饰结束
        System.out.print("】");
    }
}
