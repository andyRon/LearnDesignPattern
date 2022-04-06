package com.andyron.c07;

import com.andyron.c07.facade.Facade;

public class Client {

    public void eat() {
        System.out.println("开始用餐...");
    }

    public void wash() {
        System.out.println("洗碗...");
    }

    public static void main(String[] args) {
//        c1();
        c2();
    }


    public static void c1() {
        // 找蔬菜商买菜
        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();
        // 找妹妹下厨
        Helper sister = new Helper();
        sister.cook();
        // 客户端用餐
        Client client = new Client();
        client.eat();
        //
        client.wash();
    }

    public static void c2() {
        Facade facade = new Facade();
        facade.order();
    }
}
