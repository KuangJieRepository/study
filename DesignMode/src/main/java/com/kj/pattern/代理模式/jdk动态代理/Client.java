package com.kj.pattern.代理模式.jdk动态代理;

/**
 * @Author: kj
 * @Date: 2022/08/10/13:47
 */
public class Client {
    public static void main(String[] args) {
        JdkProxyFactory proxyFactory = new JdkProxyFactory();
        SellTickets proxy = proxyFactory.getProxy();
        proxy.sell("张三");
    }
}
