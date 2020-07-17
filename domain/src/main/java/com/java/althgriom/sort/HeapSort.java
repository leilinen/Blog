package com.java.althgriom.sort;

import java.util.PriorityQueue;

/**
 * @Description:  调用优先队列实现堆排序
 * java PriorityQueue 默认实现最小堆
 * 可以改写成最大堆
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class HeapSort {

    // 最小堆实现
    public static int[] minHeapSort(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 默认实现
        for (int i=0; i< nums.length; i++) {
            priorityQueue.add(nums[i]);
        }

        int[] sortedNums = new int[nums.length];

        for (int i=0; i< nums.length; i++) {
            sortedNums[i] = priorityQueue.poll();
        }

        return sortedNums;
    }


    // 最大堆实现
    public static int[] maxHeapSort(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>( (a, b) -> {
            return b - a;
        });

        for (int i=0; i< nums.length; i++) {
            priorityQueue.add(nums[i]);
        }

        int[] sortedNums = new int[nums.length];

        for (int i=0; i< nums.length; i++) {
            sortedNums[i] = priorityQueue.poll();
        }

        return sortedNums;
    }
}
