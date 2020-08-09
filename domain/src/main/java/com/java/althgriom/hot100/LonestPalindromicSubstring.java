package com.java.althgriom.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-07
 */
public class LonestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        String longestPalindrome = "";

        for (char c : chars) {
            list.add(c);

            while (isPalindrome(list)) {
                if (longestPalindrome.length() < list.size()) {
                    longestPalindrome = getPalindrome(list);
                }
                list.remove(0);
            }

        }

        if (isPalindrome(list) && longestPalindrome.length() < list.size()) {
            longestPalindrome = getPalindrome(list);
        }
        return longestPalindrome;

    }

    public static boolean isPalindrome(List<Character> list) {

        int i = 0;

        while ( i < list.size() / 2) {
            if (!list.get(i).equals(list.get(list.size() -1 -i))) {
                return false;
            }
            i++;
        }
        return true;

    }

    private static String getPalindrome(List<Character> list) {
        StringBuilder builder = new StringBuilder();
        for (Character character : list) {
            builder.append(character);
        }
        return builder.toString();
    }

}
