package com.kj.pattern.适配器模式.类适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:44
 */
public class Computer {

    public void readSD(SdCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        sdCard.read();
    }
}
