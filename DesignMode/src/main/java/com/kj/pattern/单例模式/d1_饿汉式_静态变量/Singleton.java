package com.kj.pattern.单例模式.d1_饿汉式_静态变量;

/**
 * @Author: kj
 * @Date: 2022/08/02/14:35
 */
@SuppressWarnings("all")
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
