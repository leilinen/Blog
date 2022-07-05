package com.java.althgriom2022;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-29
 */
public class ReversePairs {

    private static int reversePairs(int[] nums) {
        int count = 0;

        for (int i=0; i<nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] s = {7, 5, 6, 4};
        System.out.println(reversePairs(s));
    }
}
