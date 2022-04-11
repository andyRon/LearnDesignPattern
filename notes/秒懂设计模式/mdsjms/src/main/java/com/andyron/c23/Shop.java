package com.andyron.c23;

import java.util.ArrayList;
import java.util.List;

/**
 * 商店类
 */
public class Shop {

    private String product;
    /**
     * 预订清单
     */
    private List<Buyer> buyers;

    public Shop() {
        this.product = "无商品";
        this.buyers = new ArrayList<>();
    }

    /**
     * 注册买家到预订清单中
     */
    public void register(Buyer buyer) {
        this.buyers.add(buyer);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        // 到货了
        this.product = product;
        // 到货后通知买家
        notifyBuyers();
    }

    private void notifyBuyers() {
        buyers.stream().forEach(b -> b.inform(this.getProduct()));
    }
}
