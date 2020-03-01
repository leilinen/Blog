package com.java.althgriom.leetcode;

import org.junit.Assert;

import static com.java.althgriom.leetcode.SearchInsert.searchInsert;

public class SearchInsertTest {

    @org.junit.Test
    public void searchInsertTest() {
        int[] a1 = {1,3,5,6};
        int b1 = 5;

        int b2 = 2;

        int b3 = 7;

        int b4 = 0;

        Assert.assertEquals(2, searchInsert(a1, b1));
        Assert.assertEquals(1, searchInsert(a1, b2));
        Assert.assertEquals(4, searchInsert(a1, b3));
        Assert.assertEquals(0, searchInsert(a1, b4));

    }
}
