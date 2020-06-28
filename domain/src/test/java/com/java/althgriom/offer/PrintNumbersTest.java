package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class PrintNumbersTest {

    @Test
    public void printNumbersTest() {

        int[] arrays = PrintNumbers.printNumbers(1);
        int i=0;
        while (i != arrays.length) {
            System.out.print(arrays[i] + " ");
            if ((i+1) %10 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}