package com.kj.pattern.建造者模式.d2_普通应用;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:36
 * 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 对建造者模式的方法组装，完成一个对象的创建
     * <p>
     * 工厂模式，侧重一整个对象的创建
     * 建造者模式，侧重建造的步骤
     *
     * @return Bike
     */
    public Bike build() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.build();
    }
}
