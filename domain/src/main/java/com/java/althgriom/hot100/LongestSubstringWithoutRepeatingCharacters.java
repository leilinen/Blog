package com.java.althgriom.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-07
 */
public class LongestSubstringWithoutRepeatingCharacters {

     public static int lengthOfLongestSubstring(String s) {

        List<Character> list = new ArrayList<>();

        char[] chars = s.toCharArray();
        int longestSubStringSize = 0;

        for (char c : chars) {

            while (list.contains(c)) {
                if (longestSubStringSize < list.size()) {
                    longestSubStringSize = list.size();
                }
                list.remove(0); // 左边缩减
            }
            list.add(c); //向右扩张
        }

        if (longestSubStringSize < list.size()) {
            longestSubStringSize = list.size();
        }

        return longestSubStringSize;
    }


}
