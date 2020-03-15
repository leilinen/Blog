package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWordTest() {

        String testCase1 = "Hello World";
        Assert.assertEquals(LengthOfLastWord.lengthOfLastWord(testCase1), 5);

        String testCase2 = " ";
        Assert.assertEquals(LengthOfLastWord.lengthOfLastWord(testCase2), 0);

        String testCase3 = "a";
        Assert.assertEquals(LengthOfLastWord.lengthOfLastWord(testCase3), 1);

        String testCase4 = "        ";
        Assert.assertEquals(LengthOfLastWord.lengthOfLastWord(testCase4), 0);
    }
}