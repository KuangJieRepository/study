package com.kj.pattern.工厂模式.普通工厂模式;

/**
 * @Author: kj
 * @Date: 2022/08/04/11:56
 */
public abstract class Coffee {
    abstract String getName();

    public void add() {
        System.out.println("添加其他配料。。。");
    }
}
