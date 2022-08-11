package com.kj.pattern.适配器模式.类适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:51
 */
public class TFCardImpl implements TFCard {
    /**
     * 读取TF卡方法
     */
    @Override
    public void readTF() {
        System.out.println("tfcard read");
    }

    /**
     * 写入TF卡功能
     *
     * @param msg
     */
    @Override
    public void writeTF(String msg) {
        System.out.println("tfcard write" + msg);
    }
}
