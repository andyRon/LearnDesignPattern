package com.andyron.c12.dynamic;

import com.andyron.c12.Internet;
import com.andyron.c12.Modem;

/**
 * @Author: andyron
 **/
public class RouterProxy implements Internet {
    /**
     * 被代理对象
     */
    private Internet modem;

    public RouterProxy() throws Exception {
        // 实例化被代理类
        this.modem = new Modem("12345");
    }

    @Override
    public void httpAccess(String url) {
        // 转发请求至"猫"以访问互联网
        modem.httpAccess(url);
    }
}
