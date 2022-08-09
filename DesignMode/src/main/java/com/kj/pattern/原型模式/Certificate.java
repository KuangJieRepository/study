package com.kj.pattern.原型模式;

/**
 * @Author: kj
 * @Date: 2022/08/09/13:34
 * Cloneable : 抽象原型类
 * Certificate : 具体原型类
 */
public class Certificate implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "获得奖状！");
    }

    /**
     * 浅克隆
     */
    @Override
    public Certificate clone() throws CloneNotSupportedException {
        return (Certificate) super.clone();
    }
}
