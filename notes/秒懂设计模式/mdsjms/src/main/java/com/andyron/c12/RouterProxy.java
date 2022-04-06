package com.andyron.c12;

import java.util.Arrays;
import java.util.List;

/**
 * 路由器
 */
public class RouterProxy implements Internet {
    /**
     * 被代理对象
     */
    private Internet modem;
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    public RouterProxy() throws Exception {
        this.modem = new Modem("12345");
    }

    @Override
    public void httpAccess(String url) {
        for (String keyword : blackList) {
            if (url.contains(keyword)) {
                System.out.println("禁止访问：" + url);
                return;
            }
        }
        // 转发请求至"猫"以访问互联网
        modem.httpAccess(url);
    }
}
