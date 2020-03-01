package com.java.althgriom.leetcode;

/***
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * https://leetcode-cn.com/problems/sqrtx/
 *
 * 使用二叉搜索树提高查询速度
 */
public class MySqrt {

    public static int mySqrt(int x) {
        int low = 1;
        int high = x ;

        while (low <= high) {
            int mid  = (high - low) / 2;
            if (mid * mid < x) {
                low = mid + 1;
            } else if (mid * mid > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return 0;
    }
}
