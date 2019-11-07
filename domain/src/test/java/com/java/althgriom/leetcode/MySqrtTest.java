package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static com.java.althgriom.leetcode.MySqrt.mySqrt;

public class MySqrtTest {

    @Test
    public void mySqrtTest() {
        Assert.assertEquals(2, mySqrt(4));
        Assert.assertEquals(2, mySqrt(8));
        Assert.assertEquals(3, mySqrt(11));
        Assert.assertEquals(6, mySqrt(37));
    }
}
