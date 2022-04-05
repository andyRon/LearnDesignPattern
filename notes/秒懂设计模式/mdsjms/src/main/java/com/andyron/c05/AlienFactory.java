package com.andyron.c05;

/**
 * 外星母巢
 */
public class AlienFactory implements AbstractFactory{
    private int x;
    private int y;

    public AlienFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Roach(x, y);
        System.out.println("制造蟑螂兵成功");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Poison(x, y);
        System.out.println("制造毒液兵成功");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Mammoth(x, y);
        System.out.println("制造猛犸巨兽成功");
        return unit;
    }
}
