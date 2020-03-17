package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicatesTest() {

        int[] case1 = {};
        Assert.assertEquals(0, RemoveDuplicatesFromSortedArray.removeDuplicates(case1));

        int[] case2 = {1,1,2};
        Assert.assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(case2));

        int[] case3 = {0,0,1,1,1,2,2,3,3,4};
        Assert.assertEquals(5, RemoveDuplicatesFromSortedArray.removeDuplicates(case3));

    }
}