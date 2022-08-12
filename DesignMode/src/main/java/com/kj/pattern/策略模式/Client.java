package com.kj.pattern.策略模式;

/**
 * @Author: kj
 * @Date: 2022/08/12/17:48
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(Strategy.STRATEGYA);
        salesMan.salesManShow();


        Strategy strategya = Strategy.STRATEGYA;
        Strategy strategya2 = Strategy.STRATEGYA;
        // true
        System.out.println(strategya2 == strategya);
    }
}
