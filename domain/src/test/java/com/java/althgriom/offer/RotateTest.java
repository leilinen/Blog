package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-29
 */
public class RotateTest {

    @Test
    public void rotateTest() {

        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        Rotate.rotate(test1, 3);

        for (int i=0; i<test1.length; i++) {
            System.out.print(test1[i] + " ");
        }
    }

    @Test
    public void rotateTest2() {

        int[] test1 = {-1, -100, 3, 99};
        Rotate.rotate(test1, 2);

        for (int i=0; i<test1.length; i++) {
            System.out.print(test1[i] + " ");
        }
    }
}