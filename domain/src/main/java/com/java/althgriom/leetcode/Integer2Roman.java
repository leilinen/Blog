package com.java.althgriom.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 */
public class Integer2Roman {

    private Map< Integer, String> integer2Roman = new HashMap<>();

    Set<String> s1 = new HashSet<>();

    public Integer2Roman() {
        this.integer2Roman.put(1, "I");
        this.integer2Roman.put(5, "V");
        this.integer2Roman.put(10, "X");
        this.integer2Roman.put(50, "L");
        this.integer2Roman.put(100, "C");
        this.integer2Roman.put(500, "D");
        this.integer2Roman.put(1000, "M");
        this.integer2Roman.put(4, "IV");
        this.integer2Roman.put(9, "IX");
        this.integer2Roman.put(40, "XL");
        this.integer2Roman.put(90, "XC");
        this.integer2Roman.put(400, "CD");
        this.integer2Roman.put(900, "CM");
    }

    public String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        while (num != 0) {
            int near = near(num);
            roman.append(integer2Roman.get(near));
            num = num - near;
        }

        return roman.toString();
    }


    public int near(int num) {
        Set<Integer> keys = integer2Roman.keySet();
        int min = 100000000;
        int key = -1;
        for(Integer k: keys) {
            if (num - k >= 0 && num - k < min) {
                min = num - k;
                key = k;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        Integer2Roman i2r = new Integer2Roman();

        int test1 = 3;
        int test2 = 4;
        int test3 = 9;
        int test4 = 58;
        int test5 = 1994;


        System.out.println("3: " + i2r.intToRoman(test1));
        System.out.println("4: " + i2r.intToRoman(test2));
        System.out.println("9: " + i2r.intToRoman(test3));
        System.out.println("58: " + i2r.intToRoman(test4));
        System.out.println("1994: " + i2r.intToRoman(test5));

    }

}
