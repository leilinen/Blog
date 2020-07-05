package com.java.althgriom.offer;

/**
 * @Description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * @Author: leiline
 * @CreateTime: 2020-07-01
 */
public class SpiralOrder {

    public static int[] spiralOrder(int[][] matrix) {

        int m = matrix.length, n = 0;
        if (m > 0) {
            n = matrix[0].length;
        }

        int[] ans = new int[m*n];

        int k = 0;
        int circle = 0;

        while (true) {

            // ->
            int i = circle;
            for (int j = circle; j < n - circle; j++) {
                ans[k] = matrix[i][j];
                k++;
            }

            if (k >= m*n) {
                break;
            }

            // |
            // V

            int j = n - 1 - circle;
            for (i = 1 + circle; i < m - circle; i++) {
                ans[k] = matrix[i][j];
                k++;
            }

            if (k >= m*n) {
                break;
            }

            // <-
            i = m - 1 - circle;
            for (j = n - 2 - circle; j >= 0 + circle; j--) {
                ans[k] = matrix[i][j];
                k++;
            }

            if (k >= m*n) {
                break;
            }

            // ^
            // |
            j = circle ;
            for (i = circle +1; i < m - 1 - circle; i++) {
                ans[k] = matrix[i][j];
                k++;
            }

            if (k >= m*n) {
                break;
            }

            circle ++;
        }

        return ans;

    }
}
