package com.andyron.ch01.uml;

/**
 * 鸟
 * @Author: andyron
 **/
public class Bird extends Animal {

    private Wing wing;

    public Bird() {
    }

    public Bird(Wing wing) {
        this.wing = wing;
    }

    @Override
    public void xinchengdaixie() {

    }

    @Override
    public void fanzhi() {

    }

    /**
     * 羽毛
     */
    public String feather;

    /**
     * 牙齿或角质喙
     */
    public String yaci;

    /**
     * 下蛋
     */
    public void xiadan() {
        System.out.println("下蛋");
    }
}
