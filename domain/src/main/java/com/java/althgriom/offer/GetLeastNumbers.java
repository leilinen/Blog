package com.java.althgriom.offer;

import java.util.PriorityQueue;

/**
 * @Description:  输入整数数组 arr ，找出其中最小的 k 个数,
 *
 * 堆排序，快速排序
 *
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class GetLeastNumbers {

    public static int[] getLeastNumbers(int[] arr, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 默认实现
        for (int i=0; i< arr.length; i++) {
            priorityQueue.add(arr[i]);
        }

        int[] sortedNums = new int[k];

        for (int i=0; i< k; i++) {
            sortedNums[i] = priorityQueue.poll();
        }
        return sortedNums;
    }
}
