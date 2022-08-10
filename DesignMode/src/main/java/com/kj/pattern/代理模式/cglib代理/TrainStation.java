package com.kj.pattern.代理模式.cglib代理;


/**
 * @Author: kj
 * @Date: 2022/08/10/11:44
 * 真实主题（Real Subject）类
 */
public class TrainStation{
    /**
     * 卖票
     *
     * @param username
     */
    public void sell(String username) {
        System.out.println("火车站卖票给-->" + username);
    }
}
