package com.kj.pattern.迭代器模式.使用提供好的类;

import com.kj.pattern.迭代器模式.StudentIterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 */
public class StudentIteratorImpl implements Iterator<Student> {
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }


}