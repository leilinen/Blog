package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueIcciTest {

    @Test
    public void isUniqueTest() {

        String testCase1 = "leetcode";
        Assert.assertFalse(IsUniqueIcci.isUnique(testCase1));

        String testCase2 = "abc";
        Assert.assertTrue(IsUniqueIcci.isUnique(testCase2));

        String testCase3 = "";
        Assert.assertTrue(IsUniqueIcci.isUnique(testCase3));
    }
}