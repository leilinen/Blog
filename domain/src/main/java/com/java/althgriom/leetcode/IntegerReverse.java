package com.java.althgriom.leetcode;

/***
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class IntegerReverse {

    public static int reverse(int x) {
        boolean isNegative = false;
        int reversedX;
        if (x<0) {
            isNegative = true;
            x = 0 - x;
        }
        String temp = String.valueOf(x);
        String reversed = reverse(temp);
        try {
            reversedX = Integer.valueOf(reversed);
            if (isNegative) {
                reversedX = 0 - reversedX;
            }
        } catch (Exception e) {
            reversedX = 0;
        }
        return reversedX;
    }

    private static String reverse(String x) {
        char[] chars = x.toCharArray();

        int len = chars.length;
        char[] reversed = new char[len];
        for (int i=len-1, j=0; i>=0; i--, j++) {
            reversed[j] = chars[i];
        }
        return String.valueOf(reversed);
    }
}
