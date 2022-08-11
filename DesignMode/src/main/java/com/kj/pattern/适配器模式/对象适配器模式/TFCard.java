package com.kj.pattern.适配器模式.对象适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:50
 */
public interface TFCard {
    /**
     * 读取TF卡方法
     */
    void readTF();

    /**
     * 写入TF卡功能
     *
     * @param msg
     */
    void writeTF(String msg);
}
