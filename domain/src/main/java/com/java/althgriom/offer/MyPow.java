package com.java.althgriom.offer;

/**
 * @Description: 实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class MyPow {

    public static double myPow(double x, int n) {
        double res = 1.00000;

        if (x == 1) return res;
        if (x == -1 && n %2 == 0) return res;
        if (x == -1 && n % 2 == 1) return -res;

        if (n == 0) {
            return res;
        }  else if (n < 0) {
            x = 1/ x;
            n = -n;
        }

        if (n <0) {
            return 0.00000;
        }

        for (int i=0; i<n; i++) {
            res = res *x;
        }
        return res;
    }
}
