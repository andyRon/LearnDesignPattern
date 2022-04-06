package com.andyron.c07.facade;

import com.andyron.c07.VegVendor;

public class Facade {

    private VegVendor vegVendor;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;

    public Facade() {
        this.vegVendor = new VegVendor();

        // 开么前就找蔬菜商准备好蔬菜
        vegVendor.purchase();
        // 雇佣厨师
        this.chef = new Chef();
        // 雇佣服务员
        this.waiter = new Waiter();
        // 雇佣清洁工
        this.cleaner = new Cleaner();
    }

    public void order() {
        //
        waiter.order();
        //
        chef.cook();
        //
        waiter.serve();
        //
        cleaner.clean();
        cleaner.wash();
    }
}
