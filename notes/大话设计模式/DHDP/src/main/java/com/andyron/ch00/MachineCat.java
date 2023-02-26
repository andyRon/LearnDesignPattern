package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class MachineCat extends Cat implements IChange {

    public MachineCat() {
        super();
    }

    public MachineCat(String name) {
        super(name);
    }
    @Override
    public String changeThing(String thing) {
        return super.shout() + "，我万能的口袋，可以变出 " + thing;
    }
}
