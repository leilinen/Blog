package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-25
 */
public class ValidateStackSequencesTest {

    @Test
    public void validateStackSequencesTest1() {

        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        Assert.assertTrue(ValidateStackSequences.validateStackSequences(pushed, popped));
    }

    @Test
    public void validateStackSequencesTest2() {

        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};

        Assert.assertFalse(ValidateStackSequences.validateStackSequences(pushed, popped));
    }

    @Test
    public void validateStackSequencesTest3() {

        int[] pushed = {0};
        int[] popped = {0};

        Assert.assertTrue(ValidateStackSequences.validateStackSequences(pushed, popped));
    }
}