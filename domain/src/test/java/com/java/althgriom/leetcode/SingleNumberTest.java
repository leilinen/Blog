package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class SingleNumberTest {

    @Test
    public void singleNumberTest() {
        int[] case1 = {2,2,1};
        Assert.assertEquals(1, SingleNumber.singleNumber(case1));

        int[] case2 = {4,1,2,1,2};
        Assert.assertEquals(4, SingleNumber.singleNumber(case2));
    }
}