package com.kj.pattern.建造者模式.d1_内部构造器类;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:21
 */
public class Client {
    public static void main(String[] args) {
        Phone p1 = new Phone.Builder()
                .name("apple13pro")
                .price(200)
                .brand("apple")
                .build();

        System.out.println(p1);
    }
}
