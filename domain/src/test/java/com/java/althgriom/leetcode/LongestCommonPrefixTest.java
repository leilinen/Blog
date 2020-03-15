package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest() {

        String[] testCase1 = {
                "flower",
                "flow",
                "flight"
        };
        String commonPrefix = LongestCommonPrefix.longestCommonPrefix(testCase1);
        Assert.assertEquals("fl", commonPrefix);

        String[] testCase2 = {"dog","racecar","car"};
        String commonPrefix2 = LongestCommonPrefix.longestCommonPrefix(testCase2);
        Assert.assertEquals("", commonPrefix2);

        String[] testCase3 = {""};
        String commonPrefix3 = LongestCommonPrefix.longestCommonPrefix(testCase3);
        Assert.assertEquals("", commonPrefix3);
    }

    @Test
    public void commonCharsTest() {
        String[] case1 = {"a", "a", "a", "a", "a"};
        String[] case2 = {"a", "b", "a", "a"};

        Assert.assertTrue(LongestCommonPrefix.commonChars(case1));
        Assert.assertFalse(LongestCommonPrefix.commonChars(case2));

    }
}