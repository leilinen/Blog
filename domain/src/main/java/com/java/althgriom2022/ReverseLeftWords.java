package com.java.althgriom2022;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class ReverseLeftWords {

    public static String reverse(String s, int n) {

        StringBuilder result = new StringBuilder("");

        char[] chars =  s.toCharArray();
        for (int i=n; i < chars.length; i++) {
            result.append(chars[i]);
        }
        for (int i=0; i<n; i++) {
            result.append(chars[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverse(s, 2));

    }
}
