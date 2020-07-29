package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class ConcurrentArrTest {

    @Test
    public void concurrentArrTest() {

        int[] a = {1, 2, 3, 4, 5};
        int[] ans = ConcurrentArr.concurrentArr(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void concurrentArrTest2() {

        int[] a = {1, 2, 0, 4, 5};
        int[] ans = ConcurrentArr.concurrentArr(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}