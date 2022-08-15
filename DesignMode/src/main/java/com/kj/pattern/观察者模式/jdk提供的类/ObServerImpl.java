package com.kj.pattern.观察者模式.jdk提供的类;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: kj
 * @Date: 2022/08/15/9:55
 */
public class ObServerImpl implements Observer {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the {@code notifyObservers}
     *            method.
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        System.out.println(arg);
        System.out.println("被观察者更新了，我收到通知进行更新。。。");
        System.out.println("==================");
    }
}
