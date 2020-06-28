package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class MinSubArrayLenTest {

    @Test
    public void minSubArrayLenTest() {

        int[] nums = {};
        int target = 100;

        Assert.assertEquals(MinSubArrayLen.minSubArrayLen(target, nums), 0);
    }
}