package com.java.althgriom2022.hot100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-07-01
 */
public class LongestSubString {

    private static Integer longestSubString(String s) {

        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }
}
