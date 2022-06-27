package com.java.althgriom2022;

/**
 * @Description: 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class MaxSubArray {

    private static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i=1; i<nums.length; i++) {
            nums[i] = Math.max(nums[i-1] + nums[i], nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }


    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));

    }

}
