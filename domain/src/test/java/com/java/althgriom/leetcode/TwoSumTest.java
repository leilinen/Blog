package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static com.java.althgriom.leetcode.TwoSum.twoSum;


public class TwoSumTest {


    @Test
    public void twoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = {0, 1};
        int[] re = twoSum(nums, target);

        Assert.assertEquals(re[0], result[0]);
        Assert.assertEquals(re[1], result[1]);
    }
}
