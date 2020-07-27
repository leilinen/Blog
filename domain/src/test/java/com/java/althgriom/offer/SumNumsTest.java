package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-27
 */
public class SumNumsTest {

    @Test
    public void sumSumsTest() {

        Assert.assertEquals(SumNums.sumSums(3), 6);

        Assert.assertEquals(SumNums.sumSums(9), 45);
    }
}