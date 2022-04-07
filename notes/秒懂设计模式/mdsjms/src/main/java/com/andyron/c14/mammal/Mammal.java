package com.andyron.c14.mammal;

/**
 * 哺乳动物类
 * 两个方法"abstract"声明凡是哺乳动物必须实现这两个行为。
 * 生存方法live()则以实体方法的形式出现，这就意味着所有哺乳动物都要以此为模板，这便是我们要抽离出来的模板方法了。
 */
public abstract class Mammal {

    public abstract void move();

    public abstract void eat();

    public void live() {
        move();
        eat();
    }
}
