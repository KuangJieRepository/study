package com.kj.pattern.单例模式.d3_懒汉式_doubleCheckedLocking;

/**
 * @Author: kj
 * @Date: 2022/08/02/14:35
 */
@SuppressWarnings("all")
public class Singleton {
    private Singleton() {
    }

    /*volatile 防止多线程下，指定重排序，获取空的对象，保证有序性  */
    private static volatile Singleton instance;

    /**
     * 双重判空，检查
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                /*防止多线程下，多次创建*/
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
