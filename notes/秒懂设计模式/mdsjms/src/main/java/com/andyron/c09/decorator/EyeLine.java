package com.andyron.c09.decorator;

import com.andyron.c09.Showable;

/**
 * 眼线
 * @Author: andyron
 **/
public class EyeLine extends Decorator {

    public EyeLine(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("画眼线【");
        showable.show();
        System.out.print("】");
    }
}
