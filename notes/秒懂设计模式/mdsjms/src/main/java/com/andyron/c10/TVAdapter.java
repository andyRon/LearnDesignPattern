package com.andyron.c10;

/**
 * 电视机专属适配器类
 * 类适配器（某个类的“专属适配器”），也就是在编码阶段已经将被匹配的设备与目标接口进行对接了也就是在编码阶段已经将被匹配的设备与目标接口进行对接了
 */
public class TVAdapter extends TV implements TriplePin {

    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
