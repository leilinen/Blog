package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class ContainerTest {

    @Test
    public void maxAreaTest() {

        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(Container.maxArea(heights), 49);
    }
}