package com.kj.pattern.单例模式.d6_破坏单例;

import java.lang.reflect.Constructor;

/**
 * @Author: kj
 * @Date: 2022/08/02/15:29
 */
public class 反射破坏 {
    public static void main(String[] args) throws Exception {
        Class<Singleton1> aClass = Singleton1.class;
        Constructor<Singleton1> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton1 singleton1 = constructor.newInstance();
        Singleton1 singleton2 = constructor.newInstance();
        System.out.println(singleton1 == singleton2);
    }
}
