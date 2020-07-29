package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class nthUglyNumTest {

    @Test
    public void nthUglyNumberTest() {

        int n = 10;
        Assert.assertEquals(nthUglyNum.nthUglyNumber(n), 12);
    }
}