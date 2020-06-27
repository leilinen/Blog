package com.java.althgriom.offer;

/**
 * @Description: 斐波那契数列
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class Fibonacci {



    public static int fib(int n) {


        int[] params = new int[2];
        int res = 0;

        if (n==0) return 0;
        if (n==1) return 1;

        for (int i=0; i<n; i++) {

            params[1] = res;

            if (i==0) {
                params[0] = 0;
            }

            if (i==1) {
                params[1] = 1;
            }

            res = (params[0] + params[1]) % 1000000007;
            params[0] = params[1];

        }

        return res;

    }
}
