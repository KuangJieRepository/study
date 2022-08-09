package com.kj.pattern.建造者模式.d2_普通应用;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:33
 * 具体建造者实现类
 */
public class OfoBuilder extends Builder {
    /**
     * 构建车架
     */
    @Override
    public void buildFrame() {
        bike.setFrame("ofo 车架");
    }

    /**
     * 构建车座
     */
    @Override
    public void buildSeat() {
        bike.setSeat("ofo 车座");
    }

    /**
     * 构建一个 bike 对象
     */
    @Override
    public Bike build() {
        return bike;
    }
}
