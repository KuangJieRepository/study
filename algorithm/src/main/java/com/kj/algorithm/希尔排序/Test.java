package com.kj.algorithm.希尔排序;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: kj
 * @Date: 2022/08/17/14:58
 *  事后分析法，分析，发现性能差距较大
 *  希尔排序时间复杂度在 O（n 的 1.3 -1.6 次方）
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws Exception {
        Integer[] ins = new Integer[]{4, 5, 6, 3, 2, 1};
        ShellSort.sort(ins);
        log.info(Arrays.toString(ins));

        //        generateData();

        // 测试直接插入排序和希尔排序的时间消耗，十万条数据
        Integer[] integers = loadData();

        // 插入排序
//        long start = System.currentTimeMillis();
//        InsertionSort.sort(integers);
//        long end = System.currentTimeMillis();
//        log.info("耗时：{}ms", end - start); // 40523 ms

        // 希尔排序
        long start2 = System.currentTimeMillis();
        ShellSort.sort(integers);
        long end2 = System.currentTimeMillis();
        log.info("耗时：{}ms", end2 - start2); // 32 ms
    }

    /**
     * 十万行数据
     */
    public static void generateData() throws Exception {
        File file = new File("algorithm/src/main/resources/data.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int i = 100000; i > 0; i--) {
            bw.write(i + "");
            bw.newLine();
        }
        bw.close();
    }

    /**
     * 加载数据进内存
     */
    public static Integer[] loadData() throws Exception {
        File file = new File("algorithm/src/main/resources/data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        ArrayList<Integer> list = new ArrayList<>();
        while ((s = br.readLine()) != null) {
            list.add(Integer.parseInt(s));
        }
        br.close();
        Integer[] ins = new Integer[list.size()];
        return list.toArray(ins);
    }
}
