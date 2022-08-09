package com.kj.pattern.原型模式;

/**
 * @Author: kj
 * @Date: 2022/08/09/13:52
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Certificate c = new Certificate();
        c.setName("张三");
        Certificate c2 = c.clone();
        c.show();
        c2.show();
    }

}
