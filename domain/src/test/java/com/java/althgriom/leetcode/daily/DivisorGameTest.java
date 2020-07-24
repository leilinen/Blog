package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-24
 */
public class DivisorGameTest {

    @Test
    public void divisorGameTest() {

        Assert.assertTrue(DivisorGame.divisorGame(2));

        Assert.assertFalse(DivisorGame.divisorGame(3));
    }

    @Test
    public void divisorGameTest2() {
        Assert.assertFalse(DivisorGame.divisorGame(5));
    }
}