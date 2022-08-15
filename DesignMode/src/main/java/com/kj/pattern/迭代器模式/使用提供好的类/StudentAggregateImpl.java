package com.kj.pattern.迭代器模式.使用提供好的类;

import com.kj.pattern.迭代器模式.StudentIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();  // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIteratorImpl(this.list);
    }
}