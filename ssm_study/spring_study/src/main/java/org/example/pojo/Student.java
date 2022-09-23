package org.example.pojo;

/**
 * @Author: kj
 * @Date: 2022/08/30/15:40
 */
public class Student {
    private String name;
    private int age;
    private String money;
    private String expression;

    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money='" + money + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }

    public void testAspect(String name) {
        System.out.println(name);
    }
}
