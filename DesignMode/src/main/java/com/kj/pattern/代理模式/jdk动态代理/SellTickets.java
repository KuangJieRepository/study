package com.kj.pattern.代理模式.jdk动态代理;

/**
 * @Author: kj
 * @Date: 2022/08/10/11:42
 * 卖票的接口，抽象主题类
 */
public interface SellTickets {
    /**
     * 卖票
     * @param username
     */
    public void sell(String username);
}
