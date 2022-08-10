package com.kj.pattern.代理模式.cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: kj
 * @Date: 2022/08/10/17:46
 * 代理对象是被代理对象的子类，  被代理类不能被 final 修饰
 * 也可以让该类，实现 MethodInterceptor 接口 ，重写 intercept 方法
 * public class CglibProxyFactory implements MethodInterceptor {}
 */
public class CglibProxyFactory {
    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(trainStation.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("我是增强的功能啊--cglib代理！！");
                Object invoke = method.invoke(trainStation, objects);
                return invoke;
            }
        });
        return (TrainStation) enhancer.create();
    }
}
