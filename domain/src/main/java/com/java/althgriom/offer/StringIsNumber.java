package com.java.althgriom.offer;

/**
 * @Description:  这题恶心，不做了！
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class StringIsNumber {

    public static boolean isNumber(String s) {

        boolean isNumber = false;

        if (s.contains("+") && s.contains("-")) {
            return isNumber;
        }

        if (s.contains("+") && !s.startsWith("+")) {
            return isNumber;
        }

        if (s.contains("-") && !s.startsWith("-")) {
            return isNumber;
        }


        if (s.contains("e") && s.contains(".")) {
            return isNumber;
        }

        return isNumber;
    }
}
