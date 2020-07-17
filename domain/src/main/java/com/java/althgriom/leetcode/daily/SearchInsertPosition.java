package com.java.althgriom.leetcode.daily;

/**
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * @Author: leiline
 * @CreateTime: 2020-07-17
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int length = nums.length;

        for (int i=0; i<length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return length;
    }

}
