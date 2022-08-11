package com.kj.pattern.装饰者模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/14:39
 * 具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    /**
     * 获取价格
     *
     * @return price
     */
    @Override
    public float getConst() {
        return getPrice() + getFastFood().getConst();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
