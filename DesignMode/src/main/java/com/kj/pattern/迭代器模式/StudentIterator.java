package com.kj.pattern.迭代器模式;

/**
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、next() 等方法。
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}