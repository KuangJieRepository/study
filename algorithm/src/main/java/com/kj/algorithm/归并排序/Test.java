package com.kj.algorithm.归并排序;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: kj
 * @Date: 2022/08/18/15:16
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        log.info(sum(100) + "");
    }


    /**
     * 简单递归求 1 到 n 的和
     * sum(10) = 55
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(--n);
    }
}
