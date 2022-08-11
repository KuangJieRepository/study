package com.kj.pattern.装饰者模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/14:31
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象
 */
public abstract class FastFood {
    private float price;
    private String desc;


    /**
     * 获取价格
     * @return price
     */
    public abstract float getConst();

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
