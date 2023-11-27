package com.andyron.c10;

/**
 * 适配器类
 */
public class Adapter implements TriplePin {

    private DualPin dualPinDevice;

    /**
     * 创建适配器时，需要把两插设备插入进来
     */
    public Adapter(DualPin dualPinDevice) {
        this.dualPinDevice = dualPinDevice;
    }

    /**
     * 适配器实现的是目标接口
     */
    @Override
    public void electrify(int l, int n, int e) {
        // 调用被适配设备的两插通电方式，忽略地线参数e
        dualPinDevice.electrify(l, n);
    }
}
