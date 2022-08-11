package com.kj.pattern.装饰者模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/14:36
 * 具体构件（Concrete  Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(20, "炒面");
    }

    /**
     * 获取价格
     *
     * @return price
     */
    @Override
    public float getConst() {
        return getPrice();
    }
}
