package com.java.althgriom.leetcode;

/***
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        for (int i=0; i< nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

}
