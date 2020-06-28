package com.java.althgriom.offer;

/**
 * @Description: 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class PrintNumbers {

    public static int[] printNumbers(int n) {

        Double longs = Math.pow(10, n) -1;
        int l = longs.intValue();
        int[] res = new int[l];

        for (int i=0; i< l; i++) {
            res[i] = i+1;
        }

        return res;
    }
}
