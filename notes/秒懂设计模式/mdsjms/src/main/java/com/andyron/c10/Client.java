package com.andyron.c10;

public class Client {
    public static void main(String[] args) {
//        TriplePin triplePinDevice = new TV();
//        c1();
        c2();

    }

    static void c1() {
        DualPin dualPinDevice = new TV();
        TriplePin triplePinDevice = new Adapter(dualPinDevice);
        triplePinDevice.electrify(1, 0, -1);
    }

    static void c2() {
        // 电视机专属三插适配器插入三相插孔
        TriplePin tvAdapter = new TVAdapter();
        tvAdapter.electrify(1, 0, -1);

    }
}
