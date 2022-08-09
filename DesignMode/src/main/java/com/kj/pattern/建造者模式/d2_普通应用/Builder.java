package com.kj.pattern.建造者模式.d2_普通应用;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:31
 * 抽象建造者类
 */
public abstract class Builder {
    Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建车座
     */
    public abstract void buildSeat();

    /**
     * 构建一个 bike 对象
     * @return Bike
     */
    public abstract Bike build();

}
