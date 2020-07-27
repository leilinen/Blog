package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-27
 */
public class IsSubsequenceTest {

    @Test
    public void isSubsequenceTest1() {

        String s = "abc";
        String t = "ahbgdc";
        Assert.assertTrue(IsSubsequence.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceTest2() {

        String s = "axc";
        String t = "ahbgdc";
        Assert.assertFalse(IsSubsequence.isSubsequence(s, t));
    }

    @Test
    public void isSubsequenceTest3() {

        String s = "";
        String t = "ahbgdc";
        Assert.assertTrue(IsSubsequence.isSubsequence(s, t));
    }
}