package com.kj.pattern.代理模式.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: kj
 * @Date: 2022/08/10/13:42
 */
public class JdkProxyFactory {

    /**
     * 被代理对象
     */
    private TrainStation trainStation = new TrainStation();

    /**
     * 使用 proxy  获取动态代理对象
     */
    public SellTickets getProxy() {
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("我是功能增强！！！");
                        Object invoke = method.invoke(trainStation, args);
                        return invoke;
                    }
                }
        );
        return sellTickets;
    }
}
