package com.kj.algorithm.插入排序;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:45
 * 插入排序
 * 需要排 n-1 趟
 */
public class InsertionSort {

    /**
     * 把第一个元素当做已排序的，从第二个元素开始，和之前的作比较
     */
    public static void sort(Comparable[] comparable) {
        for (int i = 1; i < comparable.length; i++) {
            for (int j = i; j > 0; j--) {
                if (compare(comparable[j - 1], comparable[j])) {
                    exchange(comparable, j - 1, j);
                } else {
                    break;
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
//        return p.compareTo(s) > 0;
        return p.compareTo(s) > 0;
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
