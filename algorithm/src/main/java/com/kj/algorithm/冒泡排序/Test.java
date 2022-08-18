package com.kj.algorithm.冒泡排序;

import java.util.Arrays;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:58
 */
public class Test {
    public static void main(String[] args) {
        Integer[] ins = new Integer[]{4, 5, 6, 3, 2, 1};
        BubbleSort.sort(ins);
        System.out.println(Arrays.toString(ins));

        Integer[] ins2 = new Integer[]{6, 5, 4, 3, 2, 1};
        BubbleSort.sort(ins2);
        System.out.println(Arrays.toString(ins));


        Integer[] ins3 = new Integer[]{6, 5, 4, 3, 2, 1};
        BubbleSort2.sort(ins3);
        System.out.println(Arrays.toString(ins));

    }
}
