package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-01
 */
public class FindCommonLengthTest {

    @Test
    public void findLengthTest() {

        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};

        Assert.assertEquals(FindCommonLength.findLength2(A, B), 3);
    }
}