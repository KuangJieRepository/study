package com.kj.pattern.单例模式.d6_破坏单例;

import java.io.Serializable;

/**
 * @Author: kj
 * @Date: 2022/08/02/14:35
 */
@SuppressWarnings("all")
public class Singleton2 implements Serializable {

    private Singleton2() {
        synchronized (Singleton2.class) {
            if (SingletonHolder.instance != null) {
                throw new RuntimeException("禁止多次创建");
            }
        }
    }

    private static class SingletonHolder {
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }

    /* 防止反序列化破坏*/
    public Object readResolve() {
        return SingletonHolder.instance;
    }
}
