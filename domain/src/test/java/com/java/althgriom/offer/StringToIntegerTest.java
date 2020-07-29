package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class StringToIntegerTest {

    @Test
    public void strToIntTest() {
        String test1 = "42";
        Assert.assertEquals(StringToInteger.strToInt(test1), 42);
    }

    @Test
    public void strToIntTest2() {
        String test1 = " -42";
        Assert.assertEquals(StringToInteger.strToInt(test1), -42);
    }

    @Test
    public void strToIntTest3() {
        String test1 = "4193 with words";
        Assert.assertEquals(StringToInteger.strToInt(test1), 4193);
    }

    @Test
    public void strToIntTest4() {
        String test1 = "words and 987";
        Assert.assertEquals(StringToInteger.strToInt(test1), 0);
    }

    @Test
    public void strToIntTest5() {
        String test1 = "-91283472332";
        Assert.assertEquals(StringToInteger.strToInt(test1), -2147483648);
    }

    @Test
    public void strToIntTest6() {
        String test1 = "+1";
        Assert.assertEquals(StringToInteger.strToInt(test1), 1);
    }

    @Test
    public void strToIntTest7() {
        String test1 = "-";
        Assert.assertEquals(StringToInteger.strToInt(test1), 0);
    }
}