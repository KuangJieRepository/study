package com.kj.pattern.策略模式;

/**
 * 为春节准备的促销活动A
 *
 * @author kuangjie
 * <p>
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 */
public class StrategyA implements Strategy {

    public void show() {
        System.out.println("买一送一");
    }
}