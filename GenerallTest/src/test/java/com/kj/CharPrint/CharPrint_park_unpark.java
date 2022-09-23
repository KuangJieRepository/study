package com.kj.CharPrint;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: kj
 * @Date: 2022/09/19/15:36
 * park  unpark
 */
public class CharPrint_park_unpark {
    static Thread t1;
    static Thread t2;
    static Thread t3;

    public static void main(String[] args) {
        CharPrint charPrint = new CharPrint(30);

        t1 = new Thread(() -> {
            charPrint.print("a", t2);
        }, "t1");
        t2 = new Thread(() -> {
            charPrint.print("b", t3);
        }, "t2");
        t3 = new Thread(() -> {
            charPrint.print("c", t1);
        }, "t3");

        t1.start();
        t2.start();
        t3.start();

        LockSupport.unpark(t1);
    }

    static class CharPrint {
        private final int count;

        public CharPrint(int count) {
            this.count = count;
        }

        public void print(String str, Thread next) {
            for (int i = 0; i < count; i++) {
                LockSupport.park();
                System.out.print(str);
                LockSupport.unpark(next);
            }
        }
    }
}
