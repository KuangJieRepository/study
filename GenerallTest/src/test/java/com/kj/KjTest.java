package com.kj;

import com.kj.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.ref.WeakReference;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: kj
 * @Date: 2022/09/06/16:16
 */
@Slf4j
public class KjTest {

    @Test
    public void t0() {
        log.info("{}", "");
    }

    @Test
    public void t1() {
        Double d1 = 200.0;
        Double d2 = 200.0;
        double d3 = d2;
        log.info("{}", d1 == d2);
        int[] a = new int[3];
    }

    @Test
    public void t2() {
        Person p1 = new Person("kj", "男", "play");
        Person p2 = new Person("kj", "男", "play");
        log.info("{}", p1.equals(p2));
    }

    @Test
    public void t3() {
        WeakReference<Person> w1 = new WeakReference<>(new Person("kj", "1", "1"));
        log.info("{}", w1);
        log.info("{}", w1.get());
        System.gc();
        log.info("{}", w1);
        log.info("{}", w1.get());
        w1 = null;
        System.gc();
        log.info("{}", w1);
    }

    @Test
    public void t4() {
        ThreadLocal<Person> local = new ThreadLocal<>();
//        Person kj = new Person("kj", "1", "1");
        local.set(new Person("kj", "1", "1"));
        System.gc();
        Person person = local.get();
        log.info("{}", person);
        local.remove();
        System.gc();

        log.info("{}", person);
    }

    @Test
    public void t5() {
        byte a = 127;
        byte b = 127;
//        b = a + b; // 报编译错误:cannot convert from int to byte
        b += a;
        log.info("{}", b);
    }

    @Test
    public void t6() {
        String s0 = "ab";
        String s1 = new String("a") + new String("b");
        String s2 = s1.intern();
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void t7() throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        new Thread(task, "t1").start();
        System.out.println(task.get());
    }

    @Test
    public void t8() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


}
