package com.java.althgriom.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class HeapSortTest {

    int[] nums = {4, 5, 8, 2, 3, 9, 7, 1};

    @Test
    public void minHeapSortTest() {

        int[] ans = HeapSort.minHeapSort(nums);
        System.out.println("min heap sort answer: ");
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void maxHeapSortTest() {
        int[] ans = HeapSort.maxHeapSort(nums);
        System.out.println("max heap sort answer: ");
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}