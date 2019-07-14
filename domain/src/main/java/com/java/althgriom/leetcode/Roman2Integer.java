package com.java.althgriom.leetcode;

import java.util.HashMap;
import java.util.Map;

/***
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */
public class Roman2Integer {

    private Map<String, Integer> roman2Integer = new HashMap<>();

    public Roman2Integer() {
        this.roman2Integer.put("I", 1);
        this.roman2Integer.put("V", 5);
        this.roman2Integer.put("X", 10);
        this.roman2Integer.put("L", 50);
        this.roman2Integer.put("C", 100);
        this.roman2Integer.put("D", 500);
        this.roman2Integer.put("M", 1000);
        this.roman2Integer.put("IV", 4);
        this.roman2Integer.put("IX", 9);
        this.roman2Integer.put("XL", 40);
        this.roman2Integer.put("XC", 90);
        this.roman2Integer.put("CD", 400);
        this.roman2Integer.put("CM", 900);
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int sLength = s.length();

        // 只有一位的情况下
        if (sLength < 2) {
            sum += roman2Integer.get(s);
            return sum;
        }

        // 大于等于2位
        for (int i = 0; i< chars.length; ) {
            if (i+1 < sLength && roman2Integer.containsKey(String.valueOf(chars[i]) + String.valueOf(chars[i+1]))) {
                sum += roman2Integer.get(String.valueOf(chars[i]) + String.valueOf(chars[i+1]));
                i+=2;
            }
            else {
                sum += roman2Integer.get(String.valueOf(chars[i]));
                i++;
            }
        }

        return sum;
    }

     public static void main(String[] args) {

        Roman2Integer r2i = new Roman2Integer();
        String test1 = "III";
        System.out.println("III, result = " + r2i.romanToInt(test1));

        String test2 = "IV";
        System.out.println("IV, result = " + r2i.romanToInt(test2));

        String test3 = "IX";
        System.out.println("IX, result = " + r2i.romanToInt(test3));
     }


}
