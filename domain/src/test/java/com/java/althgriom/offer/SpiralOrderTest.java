package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-02
 */
public class SpiralOrderTest {

    @Test
    public void spiralOrderTest() {

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//
//        int[] ans1 = SpiralOrder.spiralOrder(matrix);
//        for (int i=0; i<ans1.length; i++) {
//            System.out.print(ans1[i] + " ");
//        }
//        System.out.println();


        int[][] matrix2 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] ans2 = SpiralOrder.spiralOrder(matrix2);
        for (int i=0; i<ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }
        System.out.println();
    }
}