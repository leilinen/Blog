package com.java.althgriom.leetcode.daily;

import java.util.PriorityQueue;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class FindKthLargest2 {

    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(len, (a, b) -> a -b);
        for (int i=0; i<len; i++) {
            minHeap.add(nums[i]);
        }

        for (int i=0; i<len-k; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
