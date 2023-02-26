package com.andyron.ch00;

/**
 * @Author: andyron
 **/
public class StoneMonkey extends Monkey implements IChange {
    public StoneMonkey() {
        super();
    }

    public StoneMonkey(String name) {
        super(name);
    }

    @Override
    public String changeThing(String thing) {
        return super.shout() + "，我有七十二变，可以变出好多东西 " + thing;
    }
}
