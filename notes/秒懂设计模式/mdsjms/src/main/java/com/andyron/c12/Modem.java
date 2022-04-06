package com.andyron.c12;

/**
 * 调制解调器
 */
public class Modem implements Internet {

    public Modem(String password) throws Exception {
        if (!"12345".equals(password)) {
            throw new Exception("拨号失败，请重试！");
        }
        System.out.println("拨号上网...连接成功！");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问：" + url);
    }
}
