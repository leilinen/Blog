package com.java.althgriom.leetcode;

/***
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
public class IsUniqueIcci {

    public  static boolean isUnique(String astr) {
        if (astr.length()>26) {
            return false;
        }

        int[] chs = new int[26];
        for (int i=0; i<astr.length(); i++) {
            chs[astr.charAt(i) - 'a'] += 1;
            if (chs[astr.charAt(i) - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
