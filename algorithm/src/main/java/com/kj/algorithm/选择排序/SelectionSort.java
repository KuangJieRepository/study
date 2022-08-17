package com.kj.algorithm.选择排序;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:45
 * 选择排序
 * 需要排 n-1 趟
 *
 *
 */
public class SelectionSort {

    /**
     * i < comparable.length - 1  就是到倒数第二个元素结束，
     */
    public static void sort(Comparable[] comparable) {

        for (int i = 0; i < comparable.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < comparable.length ; j++) {
                if (compare(comparable[minIndex], comparable[j])) {
                    minIndex = j;
                }
            }
            exchange(comparable, minIndex, i);
        }
    }

    /**
     * 比较大小
     * < 0 ：从大到小排序
     * > 0 ：从小到大排序
     */
    public static boolean compare(Comparable p, Comparable s) {
//        return p.compareTo(s) > 0;
        return p.compareTo(s) < 0;
    }

    /**
     * 数据交换
     *
     * @param comparables
     * @param i
     * @param j
     */
    public static void exchange(Comparable[] comparables, int i, int j) {
        Comparable temp;
        temp = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = temp;
    }

}
