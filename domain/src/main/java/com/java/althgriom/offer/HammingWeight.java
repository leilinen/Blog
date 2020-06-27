package com.java.althgriom.offer;

/**
 * @Description:  请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class HammingWeight {

    public static int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {
            int t = n % 2;

            n = n / 2;
            if (t == 1) count ++;

        }

        return count;

    }
}
