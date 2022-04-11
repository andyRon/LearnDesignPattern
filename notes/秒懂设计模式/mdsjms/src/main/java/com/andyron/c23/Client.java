package com.andyron.c23;

public class Client {
    public static void main(String[] args) {
        Buyer tangSir = new PhoneFans("手机粉");
        Buyer barJee = new HandChopper("剁手族");

        Shop shop = new Shop();

        // 预订注册
        shop.register(tangSir);
        shop.register(barJee);

        // 商品到货
        shop.setProduct("猪肉炖粉条");
        shop.setProduct("橘子手机");
    }
}
