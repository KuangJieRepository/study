package com.kj.pattern.观察者模式;

/**
 * Observer：抽象观察者，是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 */
public interface Observer {
    void update(String message);
}