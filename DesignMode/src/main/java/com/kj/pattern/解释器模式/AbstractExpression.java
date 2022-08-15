package com.kj.pattern.解释器模式;

/**
 * 抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}