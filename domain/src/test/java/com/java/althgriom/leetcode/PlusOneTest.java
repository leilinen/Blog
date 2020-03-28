package com.java.althgriom.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void plusOneTest() {

        int[] case1 = {1, 2, 3};
        int[] case2 = {1, 9, 9};
        int[] case3 = {4, 3, 2, 1};
        int[] case4 = {9, 9, 9};

        print(PlusOne.plusOne(case1));
        print(PlusOne.plusOne(case2));
        print(PlusOne.plusOne(case3));
        print(PlusOne.plusOne(case4));
    }

    private void print(int[] arr){
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}