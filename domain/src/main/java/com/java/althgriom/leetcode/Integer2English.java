package com.java.althgriom.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * Convert a non-negative integer to its english words representation.
 * Given input is guaranteed to be less than 2^31 - 1.
 */
public class Integer2English {

    private Map< Integer, String> integer2English = new HashMap<>();

    public Integer2English() {
        this.integer2English.put(1, "one");
        this.integer2English.put(2, "two");
        this.integer2English.put(3, "three");
        this.integer2English.put(4, "four");
        this.integer2English.put(5, "five");
        this.integer2English.put(6, "six");
        this.integer2English.put(7, "seven");
        this.integer2English.put(8, "eight");
        this.integer2English.put(9, "nine");
        this.integer2English.put(10, "ten");
        this.integer2English.put(11, "eleven");
        this.integer2English.put(12, "twelve");
        this.integer2English.put(13, "thirteen");
        this.integer2English.put(14, "fourteen");
        this.integer2English.put(15, "fifteen");
        this.integer2English.put(16, "sixteen");
        this.integer2English.put(17, "seventeen");
        this.integer2English.put(18, "eighteen");
        this.integer2English.put(19, "nineteen");
        this.integer2English.put(20, "twenty");
        this.integer2English.put(30, "thirty");
        this.integer2English.put(40, "forty");
        this.integer2English.put(50, "fifty");
        this.integer2English.put(60, "sixty");
        this.integer2English.put(70, "seventy");
        this.integer2English.put(80, "eighty");
        this.integer2English.put(90, "ninety");
        this.integer2English.put(100, "hundred");
        this.integer2English.put(1000, "thousand");
        this.integer2English.put(1000000, "million");
        this.integer2English.put(1000000000, "billion");
        // this.integer2English.put(1000000000000, "one trillion");
    }


    public String numberToWords(int num) {
        StringBuffer english = new StringBuffer();
        while (num != 0) {

//            if (num < 100) {
//
//            }
            int biteSize = String.valueOf(num).length() - 1;
            int first = (int)Math.pow(10, biteSize);
            int second = num / first;
            english.append(integer2English.get(second))
                    .append(" ")
                    .append(integer2English.get(first));
            num = num - first;
            if (num != 0) {
                english.append(" ");
            }

        }

        return english.toString();
    }

    public int getFirst(int num ) {
        while (num <10 && num >0) {
            num = num / 10;
        }
        return num;
    }


    public static void main(String[] args) {

        Integer2English i2e = new Integer2English();

        int test1 = 123;
        int test2 = 12345;
        int test3 = 1234567;
        int test4 = 1234567891;
        //int test5 = 1994;


        System.out.println("123: " + i2e.numberToWords(test1));
        System.out.println("12345: " + i2e.numberToWords(test2));
        System.out.println("1234567: " + i2e.numberToWords(test3));
        System.out.println("1234567891: " + i2e.numberToWords(test4));
        //System.out.println("1994: " + i2e.numberToWords(test5));
    }
}
