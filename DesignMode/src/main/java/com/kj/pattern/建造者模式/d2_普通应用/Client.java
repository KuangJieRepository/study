package com.kj.pattern.建造者模式.d2_普通应用;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:39
 */
public class Client {
    public static void main(String[] args) {
        show(new OfoBuilder());
        show(new MobaiBuilder());
    }

    public static void show(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.build();
        System.out.println(bike);
    }
}
