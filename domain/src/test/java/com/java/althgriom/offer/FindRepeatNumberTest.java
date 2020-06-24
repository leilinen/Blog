package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindRepeatNumberTest {

    @Test
    public void findRepeatNumberTest() {

        int[] nums = {2, 3, 1, 0, 2, 5, 3};

        System.out.println(FindRepeatNumber.findRepeatNumber(nums));
    }
}