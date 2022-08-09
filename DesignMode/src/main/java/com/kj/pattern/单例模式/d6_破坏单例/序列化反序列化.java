package com.kj.pattern.单例模式.d6_破坏单例;

import java.io.*;

/**
 * @Author: kj
 * @Date: 2022/08/02/15:00
 */
public class 序列化反序列化 {
    public static void main(String[] args) throws Exception {
//        m1_双重检查方式的();
        m2_静态内部类的();
    }

    private static void m1_双重检查方式的() throws IOException, ClassNotFoundException {
        Singleton1 s1 = Singleton1.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./DesignMode/src/main/java/com/kj/pattern/单例模式/d6_破坏单例/a.txt"));
        oos.writeObject(s1);
        oos.close();
        /*读取，反序列化*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./DesignMode/src/main/java/com/kj/pattern/单例模式/d6_破坏单例/a.txt"));
        Singleton1 read_s1 = (Singleton1) ois.readObject();
        ois.close();
        System.out.println(s1 == read_s1); // false,此时单例就被破坏
    }

    private static void m2_静态内部类的() throws IOException, ClassNotFoundException {
        Singleton2 s2 = Singleton2.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./DesignMode/src/main/java/com/kj/pattern/单例模式/d6_破坏单例/s2.txt"));
        oos.writeObject(s2);
        oos.close();
        /*读取，反序列化*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./DesignMode/src/main/java/com/kj/pattern/单例模式/d6_破坏单例/s2.txt"));
        Singleton2 read_s2 = (Singleton2) ois.readObject();
        ois.close();
        System.out.println(s2 == read_s2); // false,此时单例就被破坏
    }
}
