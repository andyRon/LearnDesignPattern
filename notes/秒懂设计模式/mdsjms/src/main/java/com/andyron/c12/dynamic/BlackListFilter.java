package com.andyron.c12.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 黑名单过滤器
 * 黑名单过滤器的功能代码不再与任何业务接口有瓜葛
 * @Author: andyron
 **/
public class BlackListFilter implements InvocationHandler {

    private List<String> backList = Arrays.asList("电影", "游戏", "音乐", "小说");
    /**
     * 被代理的真实对象，如"猫"，交换机等
     */
    private Object origin;

    public BlackListFilter(Object origin) {
        // 注入被代理对象
        this.origin = origin;
        System.out.println("开启黑名单过滤功能......");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = args[0].toString();
        for (String keyword : backList) {
            if (arg.contains(keyword)) {
                System.out.println("禁止访问：" + arg);
                return null;
            }
        }

        // 调用被代理对象方法
        System.out.println("校验通过，转向实际业务......");
        // 具体被调用的是哪个被代理对象的哪个方法在运行时才能确定下来
        return method.invoke(origin, arg);
    }
}
