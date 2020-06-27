package com.java.althgriom.leetcode;

/**
 * @Description: 假设按照升序排序的数组在预先未知的某个点上进行了旋转, 请找出其中最小的元素。
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class FindMinInSortedArray {

    public static int findMin(int[] nums) {

        int len = nums.length;

        int min = nums[len-1];

        for (int i=len-1; i>=0; i--) {
            if (min >= nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
