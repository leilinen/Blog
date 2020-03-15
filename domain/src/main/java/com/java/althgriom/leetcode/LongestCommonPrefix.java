package com.java.althgriom.leetcode;



/***
 * 查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""
 */
public class LongestCommonPrefix {


    public static String longestCommonPrefix(String[] strs) {

        StringBuffer commonPrefix = new StringBuffer("");
        for (int i=0; i<strs.length; i++) {
            if (isBlank(strs[i])) {
                return commonPrefix.toString();
            }
        }

        String[][] twoDimensionStrs = toTwoDimensionArray(strs);
        int x = twoDimensionStrs.length;
        int y = twoDimensionStrs[0].length;

        for (int i=0; i<x; i++) {
            if (commonChars(twoDimensionStrs[i])) {
                commonPrefix.append(twoDimensionStrs[i][0]);
            }
        }

        return commonPrefix.toString();
    }

    private static String[][] toTwoDimensionArray(String[] strs) {
        int smallestSize = strs[0].length();
        for (int i=1; i<strs.length; i++) {
            int strLength = strs[i].length();
            if (smallestSize > strLength) {
                smallestSize = strLength;
            }
        }
        String[][] twoDimensions = new String[smallestSize][strs.length];
        for (int i=0; i<strs.length; i++) {
            String str = strs[i];
            for (int j=0; j<smallestSize; j++) {
                twoDimensions[j][i] = String.valueOf(str.charAt(j));
            }
        }
        return twoDimensions;
    }

    public static boolean commonChars(String[] str) {
        boolean common = false;
        String e = str[0];
        for (int i=1; i<str.length; i++) {
            if (e.equals(str[i])) {
                e = str[i];
            } else {
                return common;
            }
        }
        return !common;
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }


}
