package com.andyron.c09.decorator;

import com.andyron.c09.Showable;

/**
 * 口红类
 */
public class Lipstick extends Decorator{
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}
