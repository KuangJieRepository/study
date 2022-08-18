package com.kj.algorithm.插入排序;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:58
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Integer[] ins = new Integer[]{4, 5, 6, 3, 2, 1};
        InsertionSort.sort(ins);
        log.info(Arrays.toString(ins));
    }
}
