package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidBracketsTest {

    @Test
    public void isValidTest() {
        ValidBrackets validBrackets = new ValidBrackets();

        String x0 = "([]";
        Assert.assertFalse(validBrackets.isValid(x0));

        String x6 = "[";
        Assert.assertFalse(validBrackets.isValid(x6));

        String x1 = "( )";
        Assert.assertTrue(validBrackets.isValid(x1));

        String x2 = "()[]{}";
        Assert.assertTrue(validBrackets.isValid(x2));

        String x3 = "(]";
        Assert.assertFalse(validBrackets.isValid(x3));

        String x4 = "([)]";
        Assert.assertFalse(validBrackets.isValid(x4));

        String x5 = "{[]}";
        Assert.assertTrue(validBrackets.isValid(x5));


    }
}