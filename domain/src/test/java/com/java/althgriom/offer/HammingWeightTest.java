package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class HammingWeightTest {

    @Test
    public void hammingWeightTest() {

        Assert.assertEquals(HammingWeight.hammingWeight(9), 2);

        Assert.assertEquals(HammingWeight.hammingWeight(0), 0);

        Assert.assertEquals(HammingWeight.hammingWeight(8), 1);

        Assert.assertEquals(HammingWeight.hammingWeight(1024), 1);
    }
}