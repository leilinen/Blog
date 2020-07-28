package com.java.althgriom;

import com.java.althgriom.sort.QuickSort;
import org.junit.Test;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class QuickSortTest {

    @Test
    public void sortTest() {

        String[] a = {"K", "R", "A", "T", "E", "L", "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};

        QuickSort.sort(a);

        for (String s: a) {
            System.out.print(s + " ");
        }
    }
}