package com.java.althgriom.offer;

/**
 * @Description:  给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @Author: leiline
 * @CreateTime: 2020-07-29
 */
public class Rotate {

    public static void rotate(int[] nums, int k) {

        if (nums.length <= 1) {
            return;
        }

        for (int i=0; i<k; i++) {
            rotate(nums);
        }

    }

    private static void rotate(int[] nums) {
        int t = nums[nums.length -1];
        for (int i=nums.length-1; i>0; i--) {
            nums[i] = nums[i-1];
        }
        nums[0] = t;
    }
}
