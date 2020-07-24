package com.java.althgriom.leetcode.daily;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-24
 */
public class DivisorGame {

    public static boolean divisorGame(int N) {

        int computes = 0;

        while (true) {
            for (int x=1; x<N; x++) {
                if (N % x == 0) {
                    N = N - x;
                    computes ++;
                    break;
                }
            }

            if ( N <= 1) {
                break;
            }
        }

        return computes % 2 != 0;

    }


}
