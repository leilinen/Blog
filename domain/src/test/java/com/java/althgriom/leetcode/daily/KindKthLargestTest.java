package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class KindKthLargestTest {

    @Test
    public void findKthLargestTest() {

        int[] a = {1};

        int k = 1;

        Assert.assertEquals(FindKthLargest.findKthLargest(a, k), 1);

//        int[] a1 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
//        int k1 = 4;
//        Assert.assertEquals(FindKthLargest.findKthLargest(a1, k1), 4);
    }
}