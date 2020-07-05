package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-02
 */
public class KthSmallestTest {

    @Test
    public void kthSmallestTest() {

        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}};

        Assert.assertEquals(KthSmallest.kthSmallest(matrix, 8), 13);
    }
}