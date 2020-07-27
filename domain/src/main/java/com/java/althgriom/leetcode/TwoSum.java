package com.java.althgriom.leetcode;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int a=0, b=0;
        for (int i=0; i< nums.length; i++) {
            int low = i+1;
            int high = nums.length - 1;

            while (low <= high) {
                int middle = low + (high - low) / 2;
                int pre = nums[i] + nums[middle];
                if (pre == target) {
                    a = nums[i];
                    b = nums[middle];
                    int[] result = {a, b};
                    return result;
                } else if (pre < target) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        int[] result = {a, b};
        return result;
    }
}
