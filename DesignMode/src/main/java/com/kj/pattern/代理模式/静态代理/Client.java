package com.kj.pattern.代理模式.静态代理;

/**
 * @Author: kj
 * @Date: 2022/08/10/13:21
 */
public class Client {
    public static void main(String[] args) {
        // 客户卖票，和代理类打交道，不能直接访问被代理对象
        ProxyPoint proxyPoint = new ProxyPoint();
        String user = "张三";
        proxyPoint.sell(user);
    }
}
