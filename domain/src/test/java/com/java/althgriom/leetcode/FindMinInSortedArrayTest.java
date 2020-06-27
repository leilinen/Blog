package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class FindMinInSortedArrayTest {

    @Test
    public void findMinTest() {

        int[] num1 = {1, 3, 5};
        Assert.assertEquals(FindMinInSortedArray.findMin(num1), 1);

        int[] num2 = {2, 2, 2, 0, 1};
        Assert.assertEquals(FindMinInSortedArray.findMin(num2), 0);
    }
}