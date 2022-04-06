package com.andyron.c09.decorator;

import com.andyron.c09.Showable;

/**
 * 粉底类
 */
public class FoundationMakeup extends Decorator{
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}
