package com.kj.pattern.访问者模式;

public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}