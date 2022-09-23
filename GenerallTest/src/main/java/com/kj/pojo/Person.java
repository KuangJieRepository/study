package com.kj.pojo;

import lombok.ToString;

import java.util.Objects;

/**
 * @Author: kj
 * @Date: 2022/09/06/16:26
 */
@ToString
public class Person {
    private String name;
    private String sex;
    private String hobby;

    public Person() {
    }

    public Person(String name, String sex, String hobby) {
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(sex, person.sex) && Objects.equals(hobby, person.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, hobby);
    }
}
