package com.kj.pattern.装饰者模式;

/**
 * @Author: kj
 * @Date: 2022/08/11/14:43
 */
public class Client {
    public static void main(String[] args) {
        FastFood f = new FriedRice();
        System.out.println(f.getDesc() + ":" + f.getConst() + "元");
        System.out.println("===========");
        FastFood f1 = new FriedRice();
        f1 = new Egg(f1);
        f1 = new Egg(f1);
        f1 = new Egg(f1);
        System.out.println(f1.getDesc() + ":" + f1.getConst() + "元");
    }
}
