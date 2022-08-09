package com.kj.pattern.单例模式.d4_懒汉式_内部静态类;

/**
 * @Author: kj
 * @Date: 2022/08/02/14:35
 */
@SuppressWarnings("all")
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
