package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-25
 */
public class VerifyPostOrderTest {

    @Test
    public void verifyPostorderTest1() {

        int[] test1 = {1, 6, 3, 2, 5};
        Assert.assertFalse(VerifyPostOrder.verifyPostorder(test1));
    }

    @Test
    public void verifyPostorderTest2() {

        int[] test2 = {1, 3, 2, 6, 5};
        Assert.assertTrue(VerifyPostOrder.verifyPostorder(test2));
    }
}