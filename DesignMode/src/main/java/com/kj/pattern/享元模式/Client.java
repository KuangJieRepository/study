package com.kj.pattern.享元模式;

/**
 * @Author: kj
 * @Date: 2022/08/12/14:56
 * <p>
 * integer  中就用到了享元模式， -128 - 127 的对象，会存在在一个 integerCache的数组中，不在该范围的数据，则会创建新的对象
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getBox("I");
        i.display("白色");

        AbstractBox l = instance.getBox("L");
        l.display("白色");

        AbstractBox o = instance.getBox("O");
        o.display("白色");

        AbstractBox o2 = instance.getBox("O");
        o2.display("黑色");

        System.out.println(o == o2);
    }
}
