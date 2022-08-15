package com.kj.pattern.观察者模式.jdk提供的类;

import java.util.Observable;

/**
 * @Author: kj
 * @Date: 2022/08/15/9:39
 */
public class ObServableImpl extends Observable {


    public void notifyObServers(String msg) {
        super.setChanged();
        super.notifyObservers(msg);
    }
}
