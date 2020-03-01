package com.java.althgriom;

import org.junit.Assert;
import org.junit.Test;

import static com.java.althgriom.BinaryTreeSearch.binarySearch;


public class BinaryTreeSearchTest {


    @Test
    public void binarySearchTest() {
        int[] arrs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        Assert.assertEquals(5, binarySearch(arrs, key));
    }
}
