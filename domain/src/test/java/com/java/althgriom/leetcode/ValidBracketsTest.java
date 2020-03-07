package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidBracketsTest {

    @Test
    public void isValidTest() {
        String x1 = "( )";
        ValidBrackets validBrackets = new ValidBrackets();
        Assert.assertTrue(validBrackets.isValid(x1));

        String x2 = "()[]{}";
        Assert.assertTrue(validBrackets.isValid(x2));

        String x3 = "(]";
        Assert.assertTrue(validBrackets.isValid(x3));

        String x4 = "([)]";
        Assert.assertTrue(validBrackets.isValid(x4));


    }
}