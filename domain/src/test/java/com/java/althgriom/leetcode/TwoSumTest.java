package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static com.java.althgriom.leetcode.TwoSum.twoSum;


public class TwoSumTest {


    @Test
    public void twoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = {2, 7};
        int[] re = twoSum(nums, target);

        Assert.assertEquals(re[0], result[0]);
        Assert.assertEquals(re[1], result[1]);
    }

    @Test
    public void twoSumTest2() {
        int[] nums = {10,18,25,33,36,50,50,52,57,74};
        int target = 126;
        int[] result = {52, 74};
        int[] re = twoSum(nums, target);

        Assert.assertEquals(re[0], result[0]);
        Assert.assertEquals(re[1], result[1]);
    }

    @Test
    public void twoSumTest3() {
        int[] nums = {14, 15, 16, 22, 53, 60};
        int target = 76;
        int[] result = {16, 60};
        int[] re = twoSum(nums, target);

        Assert.assertEquals(re[0], result[0]);
        Assert.assertEquals(re[1], result[1]);
    }
}
