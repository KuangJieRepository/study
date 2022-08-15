package com.kj.pattern.迭代器模式.使用提供好的类;

/**
 * @Author: kj
 * @Date: 2022/08/15/11:01
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
