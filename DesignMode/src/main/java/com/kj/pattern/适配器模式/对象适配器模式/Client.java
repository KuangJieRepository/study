package com.kj.pattern.适配器模式.对象适配器模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/13:49
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.readSD(new SdCardImpl());

        System.out.println("==================");


        computer.readSD(new SDAdapterTF(new TFCardImpl()));
        /**
         * 结果：
         * sdcard read
         * ==================
         * SDAdapterTF...
         * tfcard read 对象适配器模式
         */
    }
}
