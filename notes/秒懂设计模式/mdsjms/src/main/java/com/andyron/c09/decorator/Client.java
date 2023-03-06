package com.andyron.c09.decorator;

import com.andyron.c09.Girl;
import com.andyron.c09.Showable;

public class Client {
    public static void main(String[] args) {
        // 口红包裹粉底，粉底在包裹女生
        Showable madeupGirl = new Lipstick(new FoundationMakeup((new Girl())));
        madeupGirl = new EyeLine(madeupGirl);
        madeupGirl.show();
    }
}
