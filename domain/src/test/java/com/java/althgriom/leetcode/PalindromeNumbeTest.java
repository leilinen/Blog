package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumbeTest {

    @Test
    public void isPalindromeTest() {
        Assert.assertFalse(PalindromeNumbe.isPalindrome(1000021));
        Assert.assertTrue(PalindromeNumbe.isPalindrome(121));
        Assert.assertFalse(PalindromeNumbe.isPalindrome(10));

    }

//    @Test
//    public void getFirstIntegerTest() {
//
//        Assert.assertEquals(PalindromeNumbe.getFirstInteger(100), 1);
//        Assert.assertEquals(PalindromeNumbe.getFirstInteger(121), 1);
//
//        Assert.assertEquals(PalindromeNumbe.getFirstInteger(2), 2);
//        Assert.assertEquals(PalindromeNumbe.getFirstInteger(250), 2);
//
//        Assert.assertEquals(PalindromeNumbe.getFirstInteger(521), 5);
//        Assert.assertEquals(PalindromeNumbe.getFirstInteger(1024), 1);
//
//    }
}