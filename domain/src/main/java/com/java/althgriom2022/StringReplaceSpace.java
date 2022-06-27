package com.java.althgriom2022;

/**
 * @Description: 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class StringReplaceSpace {

    private static String replaceSpace(String s) {
        final String replaced = "%20";
        StringBuilder result = new StringBuilder("");
        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ') {
                result.append(replaced);
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String test1 = "We are happy.";
        System.out.println(replaceSpace(test1));
    }
}
