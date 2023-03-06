package com.andyron.c12.dynamic;

/**
 * 局域网访问接口
 * @Author: andyron
 **/
public interface Intranet {
    /**
     * 文件访问标准（协议）
     * @param path 文件的绝对地址
     */
    public void fileAccess(String path);
}
