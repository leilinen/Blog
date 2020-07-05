package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class MajorityElementTest {

    @Test
    public void majorityElementTest() {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Assert.assertEquals(MajorityElement.majorityElement(nums), 2);

    }
}