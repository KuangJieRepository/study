package com.kj.pattern.适配器模式.类适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:51
 * 适配器（Adapter）类
 * <p>
 * 类适配器模式，一旦没有系统接口规范，则无法使用
 */
public class SDAdapterTF extends TFCardImpl implements SdCard {


    @Override
    public void read() {
        System.out.println("SDAdapterTF...");
        super.readTF();
    }

    @Override
    public void write(String msg) {
        super.writeTF(msg);
    }
}
