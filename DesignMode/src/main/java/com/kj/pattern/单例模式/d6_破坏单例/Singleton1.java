package com.kj.pattern.单例模式.d6_破坏单例;

import java.io.Serializable;

/**
 * @Author: kj
 * @Date: 2022/08/02/14:35
 */
@SuppressWarnings("all")
public class Singleton1 implements Serializable {
    // 。。。好像无法防止破坏  https://blog.csdn.net/qq_37960603/article/details/104076323
    private static boolean flag = false;

    private Singleton1() {
        synchronized (Singleton1.class) {
            if (flag) {
                throw new RuntimeException("禁止多次创建");
            }
            flag = true;
        }
    }

    /*volatile 防止多线程下，指定重排序，获取空的对象，保证有序性  */
    private static volatile Singleton1 instance;

    /**
     * 双重判空，检查
     *
     * @return
     */
    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                /*防止多线程下，多次创建*/
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

    /*可以防止反序列化破坏单例模式,Object 必须为 object*/
    private Object readResolve() {
        return getInstance();
    }
}
