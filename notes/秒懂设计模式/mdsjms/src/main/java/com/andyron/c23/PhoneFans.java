package com.andyron.c23;

/**
 * 手机买家类
 */
public class PhoneFans extends Buyer {
    public PhoneFans(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        if (product.contains("手机")) {
            System.out.print(name);
            System.out.println("购买：" + product);
        }
    }
}
