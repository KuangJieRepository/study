package com.kj.pattern.装饰者模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/14:37
 * 抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

}
