package com.andyron.c12.dynamic;

import com.andyron.c12.Internet;

import java.lang.reflect.Proxy;

/**
 * @Author: andyron
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        // 访问互联网（外网），生成路由器代理
        Internet internet = (Internet) Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy())
        );
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.游戏.com");
        internet.httpAccess("http://www.学习.com");
        internet.httpAccess("http://www.工作.com");

        System.out.println("==================");

        // 访问局域网（内网），生成交换机代理
        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new BlackListFilter(new Switch())
        );
        intranet.fileAccess("\\\\192.168.1.2\\共享\\电影\\流浪地球2.mp4");
        intranet.fileAccess("\\\\192.168.1.2\\共享\\游戏\\三国杀.exe");
        intranet.fileAccess("\\\\192.168.1.2\\shared\\Java学习资料.zip");
        intranet.fileAccess("\\\\192.168.1.2\\Java\\算法.doc");
    }
}
