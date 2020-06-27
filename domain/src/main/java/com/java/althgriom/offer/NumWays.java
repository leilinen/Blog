package com.java.althgriom.offer;

/**
 * @Description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class NumWays {

    public static int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        int[] ways = {1, 1};
        int res = 0;

        for (int i=2; i<=n; i++) {
            res = (ways[0] + ways[1]) % 1000000007 ;
            ways[0] = ways[1];
            ways[1] = res;
        }

        return res;
    }
}
