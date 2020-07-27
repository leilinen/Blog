package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-27
 */
public class MaxProfitTest {

    @Test
    public void maxProfitTest1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(MaxProfit.maxProfit(prices), 5);
    }

    @Test
    public void maxProfitTest2() {
        int[] prices = {7, 6, 4, 3, 1};
        Assert.assertEquals(MaxProfit.maxProfit(prices), 0);
    }
}