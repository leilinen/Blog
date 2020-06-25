package com.java.althgriom.offer;

public class ReplaceSpace {

    private static String replaced = "%20";

    public static String replaceSpace(String s) {

        char[] sArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<sArray.length; i++) {
            if (sArray[i] == ' ') {
                stringBuilder.append(replaced);
            } else {
                stringBuilder.append(sArray[i]);
            }
        }
        return stringBuilder.toString();
    }
}
