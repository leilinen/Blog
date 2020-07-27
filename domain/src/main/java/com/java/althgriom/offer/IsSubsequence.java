package com.java.althgriom.offer;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-27
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int i=0, j=0;
        boolean matched = false;

        while (j < tArray.length && i < sArray.length) {
            char te = tArray[j];
            char se = sArray[i];
            if (te == se) {
                i++;
            }
            j++;
        }

        if (i == sArray.length) {
            matched = true;
        }

        return matched;

    }
}
