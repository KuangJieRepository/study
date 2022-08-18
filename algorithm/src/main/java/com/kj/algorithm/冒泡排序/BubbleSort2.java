package com.kj.algorithm.冒泡排序;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:45
 * 冒泡排序
 * 需要排 n-1 趟
 */
public class BubbleSort2 {

    public static void sort(Comparable[] comparable) {
        for (int i = 0; i < comparable.length - 1; i++) {
            for (int j = i; j < comparable.length - 1; j++) {
                if (compare(comparable[j], comparable[j + 1])) {
                    exchange(comparable, j, j + 1);
                }
            }
        }
    }

    /**
     * 比较大小
     * < 0 ：从大到小排序
     * > 0 ：从小到大排序
     */
    public static boolean compare(Comparable p, Comparable s) {
        return p.compareTo(s) < 0;
    }

    /**
     * 数据交换
     *
     * @param comparable
     * @param i
     * @param j
     */
    public static void exchange(Comparable[] comparable, int i, int j) {
        Comparable temp;
        temp = comparable[i];
        comparable[i] = comparable[j];
        comparable[j] = temp;
    }

}
