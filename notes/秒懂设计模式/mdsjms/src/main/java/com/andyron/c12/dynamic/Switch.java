package com.andyron.c12.dynamic;

/**
 * 交换机
 * 由交换机组建的局域网一定能为终端设备间的文件访问与共享提供服务
 * @Author: andyron
 **/
public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }
}
