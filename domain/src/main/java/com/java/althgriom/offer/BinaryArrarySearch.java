package com.java.althgriom.offer;


import scala.concurrent.java8.FuturesConvertersImpl;

/***
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * refer to https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 */
public class BinaryArrarySearch {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        int rows = matrix.length; // 行数
        int cols = 0;
        if (rows > 0) {
            cols = matrix[0].length; // 列数
        }

        for (int i=0; i< rows; i++) {
            for (int j=0; j<cols; j++) {
                int m = matrix[i][j];
                if (m == target) {
                    return true;
                } else if (m < target) {
                    continue;
                } else if (m > target) {
                    j--;
                    break;
                }

            }

        }
        return false;
    }
}
