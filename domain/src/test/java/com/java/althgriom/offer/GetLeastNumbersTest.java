package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class GetLeastNumbersTest {

    @Test
    public void getLeastNumbersTest() {

        int[] nums = {3, 2, 1};
        int[] ans = GetLeastNumbers.getLeastNumbers(nums, 2);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}