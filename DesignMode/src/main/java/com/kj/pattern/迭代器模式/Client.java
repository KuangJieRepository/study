package com.kj.pattern.迭代器模式;

/**
 * @Author: kj
 * @Date: 2022/08/15/10:50
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三", 22));
        studentAggregate.addStudent(new Student("李四", 23));
        studentAggregate.addStudent(new Student("王五", 24));
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
