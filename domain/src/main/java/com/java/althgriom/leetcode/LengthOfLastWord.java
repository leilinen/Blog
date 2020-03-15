package com.java.althgriom.leetcode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        if (s.length() < 0 || s.equals(" ")) {
            return 0;
        }
        String[] sArr = s.split(" ");
        if (sArr.length < 1) {
            return 0;
        }

        return sArr[sArr.length - 1].length();
    }
}
