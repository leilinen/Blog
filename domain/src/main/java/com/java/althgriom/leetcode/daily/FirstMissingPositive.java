package com.java.althgriom.leetcode.daily;

/**
 * @Description:  给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        int len = nums.length;

        for (int i=0; i<len; i++) {
            while (nums[i] >=1 && nums[i] <= len && nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i] -1);
            }
        }

        for (int i=0; i<len; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return len + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
