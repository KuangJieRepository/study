package com.kj.pattern.策略模式;

/**
 * **抽象策略（Strategy）类**：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 *
 * @author kuangjie
 */
public interface Strategy {
    void show();

    Strategy STRATEGYA = new StrategyA();
    Strategy STRATEGYB = new StrategyB();
    Strategy STRATEGYC = new StrategyC();
}