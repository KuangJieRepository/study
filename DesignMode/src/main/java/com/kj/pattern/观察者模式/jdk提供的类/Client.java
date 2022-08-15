package com.kj.pattern.观察者模式.jdk提供的类;

/**
 * @Author: kj
 * @Date: 2022/08/15/9:58
 */
public class Client {
    public static void main(String[] args) {
        ObServableImpl obServable = new ObServableImpl();
        obServable.addObserver(new ObServerImpl());
        obServable.addObserver(new ObServerImpl());
        obServable.addObserver(new ObServerImpl());
        obServable.notifyObServers("args");
    }
}
