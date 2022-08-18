package com.kj.algorithm.希尔排序;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:45
 * 希尔排序
 * 先按大增长量（步长）进行，插入排序，让数据趋于有序状态，最后按照 1 插入排序
 */
public class ShellSort {

    public static void sort(Comparable[] comparable) {
        // 确定初始增长量
        int h = 1;
        while (h < comparable.length / 2) {
            h = h << 1 + 1;
        }
        // 进行希尔排序
        while (h >= 1) {
            // 确定要被插入的元素位置
            for (int i = h; i < comparable.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (compare(comparable[j - h], comparable[j])) {
                        exchange(comparable, j - h, j);
                    } else {
                        break;
                    }
                }
            }
            // 缩小增长量
            h = h >> 1;
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
