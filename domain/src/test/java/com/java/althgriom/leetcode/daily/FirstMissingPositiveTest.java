package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class FirstMissingPositiveTest {

    @Test
    public void firstMissingPositiveTest() {

        int[] nums1 = {4, 3, -1, 1};
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(nums1), 2);

        int[] nums2 = {1, 2, 0};
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(nums2), 3);

        int[] nums3 = {7, 8, 9, 11, 12};
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(nums3), 1);
    }
}