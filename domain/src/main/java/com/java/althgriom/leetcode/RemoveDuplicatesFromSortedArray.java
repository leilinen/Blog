package com.java.althgriom.leetcode;

/***
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *  
 *
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int count = 0;
        if (nums.length == 0) {
            return count;
        }
        int flag = nums[0];
        count++;
        for (int i=1, j=1; i<nums.length; i++) {
            if (nums[i]>flag) {
                count++;
                flag = nums[i];
                nums[j] = flag;
                j++;
            }
        }
        return count;

    }
}
