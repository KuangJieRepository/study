package com.kj.pattern.外观模式;

/**
 * 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 */
public class TV {
    public void on() {
        System.out.println("打开了电视....");
    }

    public void off() {
        System.out.println("关闭了电视....");
    }
}