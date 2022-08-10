package com.kj.pattern.代理模式.静态代理;

/**
 * @Author: kj
 * @Date: 2022/08/10/11:45
 * 代理（Proxy）类
 */
public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    /**
     * 卖票
     *
     * @param username
     */
    @Override
    public void sell(String username) {
        System.out.println("代售点收取服务费用，功能增强！");
        trainStation.sell(username);
    }
}
