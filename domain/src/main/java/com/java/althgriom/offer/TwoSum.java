package com.java.althgriom.offer;

/**
 * @Description: 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
 * 如果有多对数字的和等于s，则输出任意一对即可。
 * @Author: leiline
 * @CreateTime: 2020-07-27
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] res = new int[2];

        for (int i = 0; i<length-1; i++) {
            for (int j = i+1; j<length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = nums[i];
                    res[1] = nums[j];
                    break;
                }
            }
        }

        return res;
    }
}
