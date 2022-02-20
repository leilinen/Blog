package com.java.althgriom2022;

import java.util.PriorityQueue;

/**
 * @Description: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * 数组中的第K个最大元素
 * @Author: leiline
 * @CreateTime: 2022-02-12
 */
public class KthInArray {

    public static int findKthLargest(int[] nums, int k) {

        if (k < 1) {
            return 0;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k); //小顶堆，默认容量为11

        for (int n: nums) { minHeap.add(n); }

        return minHeap.peek();

    }

    public static void main(String[] args) {
        int[] n1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;

        System.out.println(findKthLargest(n1, k1));

        int[] n2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println(findKthLargest(n2, k2));
    }
}
