package com.kj.pattern.适配器模式.类适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:45
 */
public class SdCardImpl implements SdCard {
    @Override
    public void read() {
        System.out.println("sdcard read");
    }

    @Override
    public void write(String msg) {
        System.out.println("sdcard write" + msg);
    }
}
