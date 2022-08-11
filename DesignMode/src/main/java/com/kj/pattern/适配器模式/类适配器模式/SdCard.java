package com.kj.pattern.适配器模式.类适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:45
 * 目标（Target）接口
 */
public interface SdCard {
    public void read();

    public void write(String msg);
}
