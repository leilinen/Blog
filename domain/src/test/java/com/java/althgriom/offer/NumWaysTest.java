package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class NumWaysTest {

    @Test
    public void numWaysTest() {

        Assert.assertEquals(NumWays.numWays(2), 2);

        Assert.assertEquals(NumWays.numWays(7), 21);
    }
}