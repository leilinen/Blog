package com.java.althgriom.leetcode.daily;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-17
 */
public class SearchInsertPositionTest {

    @Test
    public void searchInsertTest() {

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        Assert.assertEquals(SearchInsertPosition.searchInsert(nums1, target1), 2);

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        Assert.assertEquals(SearchInsertPosition.searchInsert(nums2, target2), 1);

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        Assert.assertEquals(SearchInsertPosition.searchInsert(nums3, target3), 4);

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        Assert.assertEquals(SearchInsertPosition.searchInsert(nums4, target4), 0);


    }
}