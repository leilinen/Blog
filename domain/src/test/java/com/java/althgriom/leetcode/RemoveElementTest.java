package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElementTest() {

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int len = RemoveElement.removeElement(nums, val);
        Assert.assertEquals(len, 2);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

        int[] nums1 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val1 = 2;

        int len1 = RemoveElement.removeElement(nums1, val1);
        Assert.assertEquals(len1, 5);

        for (int i = 0; i < len1; i++) {
            System.out.println(nums1[i]);
        }
    }
}