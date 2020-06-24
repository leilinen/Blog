package com.java.althgriom.leetcode;


/***
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int length = nums.length;

        for (int i=0; i<length;) {
            if (nums[i] == val) {
                for (int j=i + 1; j<length; j++) {
                    nums[j-1] = nums[j];
                }
                length --;
            } else {
                i++;
            }
        }
        return length;
    }
}
