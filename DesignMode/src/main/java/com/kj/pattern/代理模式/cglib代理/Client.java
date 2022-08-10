package com.kj.pattern.代理模式.cglib代理;

/**
 * @Author: kj
 * @Date: 2022/08/10/17:56
 */
public class Client {
    public static void main(String[] args) {
        CglibProxyFactory proxyFactory = new CglibProxyFactory();
        TrainStation proxy = proxyFactory.getProxy();
        proxy.sell("李四");
    }
}
