package com.kj.pattern.组合模式;

/**
 * @Author: kj
 * @Date: 2022/08/12/14:03
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent m1 = new Menu("一", 2);
        m1.add(new MenuItem("1-1", 3));
        m1.add(new MenuItem("1-2", 3));
        MenuComponent m2 = new Menu("二", 2);
        m2.add(new MenuItem("2-1", 3));
        m2.add(new MenuItem("2-2", 3));
        m2.add(new MenuItem("2-3", 3));
        MenuComponent m3 = new Menu("三", 2);
        m3.add(new MenuItem("3-1", 3));
        m3.add(new MenuItem("3-2", 3));
        m3.add(new MenuItem("3-3", 3));

        MenuComponent component = new Menu("根节点", 1);
        component.add(m1);
        component.add(m2);
        component.add(m3);
        component.print();
    }
}
