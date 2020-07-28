package com.java.althgriom.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class QuickSort2Test {

    @Test
    public void sortTest() {

        Integer[] list = {3, 7, 8, 5, 2, 1, 9, 6, 4};
        QuickSort2.sort(list);

        for (Integer l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    @Test
    public void sortTest2() {

        Integer[] list = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort2.sort(list);

        for (Integer l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    @Test
    public void sortTest3() {

        Integer[] list = {3, 1, 2, 5, 4};
        QuickSort2.sort(list);

        for (Integer l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    @Test
    public void sortTest4() {

        Integer[] list = {9, 7, 10, 8};
        QuickSort2.sort(list);

        for (Integer l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}