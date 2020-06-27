package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class FibonacciTest {

    @Test
    public void fibTest() {

        Assert.assertEquals(Fibonacci.fib(1), 1);

        Assert.assertEquals(Fibonacci.fib(2), 1);

        Assert.assertEquals(Fibonacci.fib(5), 5);

    }
}