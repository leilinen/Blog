package com.java.althgriom.leetcode;

/***
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class PalindromeNumbe {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;  // [-无穷，0)
        } else if(x<10){
            return true;    // [0, 10)
        }

        int y = x;
        int reversed = 0;
        while (x > 0) {
            int s = x%10;
            reversed =   reversed * 10 + s;
            x = x / 10;
        }

        return reversed == y;
    }


}
