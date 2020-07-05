package com.java.althgriom.leetcode.daily;

/**
 * @Description:  给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * @Author: leiline
 * @CreateTime: 2020-07-02
 */
public class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {

        int m = matrix.length, n = 0;
        if (m > 0) {
            n = matrix[0].length;
        }

        int left = matrix[0][0];
        int right = matrix[m-1][n-1];

        if ( k > m*n) {
            return right;
        }

        while (left < right) {
            int mid = (left + right) / 2;
            int smallerCount = smallerThanVCount(matrix, mid, m, n);
            if (smallerCount < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    /***
     * 计算matrix中小于v的值的个数
     * @param matrix
     * @param v
     * @param m
     * @param n
     * @return
     */
    private static int smallerThanVCount(int[][] matrix, int v, int m, int n) {
        int count = 0;
        for (int i=0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] <= v) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
