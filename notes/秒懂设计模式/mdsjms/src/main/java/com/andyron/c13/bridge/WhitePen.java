package com.andyron.c13.bridge;

public class WhitePen extends Pen {
    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白");
        ruler.regularize();
    }
}
