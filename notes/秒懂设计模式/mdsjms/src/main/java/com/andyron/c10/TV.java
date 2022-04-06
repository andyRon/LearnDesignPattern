package com.andyron.c10;

/**
 * 电视机类
 */
public class TV implements DualPin{
    @Override
    public void electrify(int l, int n) {
        System.out.print("火线通电：" + l + "，零线通电：" + n);
        System.out.println(" 电视开机");
    }
}
