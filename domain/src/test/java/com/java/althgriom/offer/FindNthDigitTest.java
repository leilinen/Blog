package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-18
 */
public class FindNthDigitTest {

    @Test
    public void findNthDigitTest() {

        Assert.assertEquals(FindNthDigit.findNthDigit(3), 3);

        Assert.assertEquals(FindNthDigit.findNthDigit(11), 0);
    }
}