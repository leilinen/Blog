package com.java.althgriom.offer;

public class FindRepeatNumber {


    public static int findRepeatNumber(int[] nums) {

        int length = nums.length;
        if (length <= 1) {
            return nums[0];
        }

        for (int i=0; i<length; i++) {
            for (int j = i+1; j<length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
