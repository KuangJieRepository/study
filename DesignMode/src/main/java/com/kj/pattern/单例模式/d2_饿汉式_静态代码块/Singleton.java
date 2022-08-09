package com.kj.pattern.单例模式.d2_饿汉式_静态代码块;

/**
 * @Author: kj
 * @Date: 2022/08/02/14:35
 */
@SuppressWarnings("all")
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
