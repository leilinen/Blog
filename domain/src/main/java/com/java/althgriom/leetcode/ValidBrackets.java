package com.java.althgriom.leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/***
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */

public class ValidBrackets {

    private static Map<String, String> matchMap = new HashMap<>();

    static {
        matchMap.put("{", "}");
        matchMap.put("[", "]");
        matchMap.put("(", ")");
    }

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        char[] chars = s.replace(" ", "").toCharArray();
        boolean matched = false;
        if (chars.length < 1) {
            return true;
        } else if (chars.length % 2 != 0) {
            return false;
        }

        for (char c: chars) {
            String e = String.valueOf(c);
            if (stack.isEmpty()) {
                stack.push(e);
            } else {
                String peek = stack.peek();
                if (match(peek, e)) {
                    stack.pop();
                } else {
                    stack.push(e);
                }

            }

        }
        if (stack.isEmpty()) {
            matched = true;
        } else {
            matched = false;
        }
        return matched;
    }

    /***
     *
     * @param a  key
     * @param b  value
     * @return
     */
    private boolean match(String a, String b) {

        return b.equals(matchMap.get(a));
    }
}


