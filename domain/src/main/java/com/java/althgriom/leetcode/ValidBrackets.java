package com.java.althgriom.leetcode;

import org.apache.commons.lang3.StringUtils;

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
        char[] chars = s.toCharArray();
        int limit = chars.length /2;
        for (int i=0; i < limit; i++) {
            stack.push(String.valueOf(chars[i]));
        }

        for (int j=limit; j<chars.length; j++) {
            if (!stack.empty()) {
                String prepareMatch = stack.pop();
                if (StringUtils.isBlank(prepareMatch)
                        || StringUtils.isBlank(String.valueOf(chars[j]))) continue;
                if (!match(prepareMatch, String.valueOf(chars[j])))  return false;
            }
        }

        return true;
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


