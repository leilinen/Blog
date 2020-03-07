package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerReverseTest {

    @Test
    public void reverseTest() {
        Assert.assertEquals(321, IntegerReverse.reverse(123));
        Assert.assertEquals(-321, IntegerReverse.reverse(-123));
        Assert.assertEquals(12, IntegerReverse.reverse(210));
    }
}