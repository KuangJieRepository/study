package com.kj.pattern.迭代器模式.使用提供好的类;

import com.kj.pattern.迭代器模式.StudentIterator;

/**
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 */
public interface StudentAggregate extends Iterable<Student> {
    void addStudent(Student student);

    void removeStudent(Student student);

}