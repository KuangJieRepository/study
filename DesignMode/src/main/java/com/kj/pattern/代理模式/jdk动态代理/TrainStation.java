package com.kj.pattern.代理模式.jdk动态代理;

/**
 * @Author: kj
 * @Date: 2022/08/10/11:44
 * 真实主题（Real Subject）类
 */
public class TrainStation implements SellTickets {
    /**
     * 卖票
     *
     * @param username
     */
    @Override
    public void sell(String username) {
        System.out.println("火车站卖票给-->" + username);
    }
}
