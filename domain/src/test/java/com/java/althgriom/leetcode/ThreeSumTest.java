package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.java.althgriom.leetcode.ThreeSum.threeSum;

public class ThreeSumTest {

    @Test
    public void threeSumTest() {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> re = threeSum(nums);

        Assert.assertEquals(re.size(), 2);
        Assert.assertEquals((long)re.get(0).get(0), -1);

    }
}
