package com.andyron.c10;

/**
 * 电视机专属适配器类
 */
public class TVAdapter extends TV implements TriplePin{

    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
