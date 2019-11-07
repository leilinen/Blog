package com.java.althgriom.leetcode;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int a=0, b=0;
        for (int i=0; i< nums.length; i++) {
            for (int j=i+1; j< nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a = i;
                    b = j;
                }
            }
        }
        int[] result = {a, b};
        return result;
    }
}
