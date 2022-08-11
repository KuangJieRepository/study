package com.kj.pattern.适配器模式.对象适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:51
 * 适配器（Adapter）类
 * <p>
 * 对象适配器模式，即使没有系统接口规范，也可以集成系统需要的类，完成工作。
 * 内部聚合了，适配者类
 */
public class SDAdapterTF implements SdCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void read() {
        System.out.println("SDAdapterTF...");
        tfCard.readTF();
    }

    @Override
    public void write(String msg) {
        tfCard.writeTF(msg);
    }
}
