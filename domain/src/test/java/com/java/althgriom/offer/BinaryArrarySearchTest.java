package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryArrarySearchTest {

    @Test
    public void findNumberIn2DArrayTest() {

        int[][] matrics = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
//        int target = 10;
//        boolean find = BinaryArrarySearch.findNumberIn2DArray(matrics, target);
//        Assert.assertTrue(find);

        int target = 25;
        boolean find = BinaryArrarySearch.findNumberIn2DArray(matrics, target);
        Assert.assertFalse(find);

        int[][] matircs2 = {};
        target = 0;
        find = BinaryArrarySearch.findNumberIn2DArray(matircs2, target);
        Assert.assertFalse(find);
    }
}