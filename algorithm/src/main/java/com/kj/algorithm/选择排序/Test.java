package com.kj.algorithm.选择排序;

import java.util.Arrays;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:58
 */
public class Test {
    public static void main(String[] args) {
        Integer[] ins = new Integer[]{4, 5, 6, 3, 2, 1};
        SelectionSort.sort(ins);
        System.out.println(Arrays.toString(ins));

        Integer[] ins2 = new Integer[]{6, 5, 4, 3, 2, 1};
        SelectionSort.sort(ins2);
        System.out.println(Arrays.toString(ins));


    }
}
