package com.java.althgriom2022.hot100;

import scala.Char;

import java.util.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-07-04
 */
public class ValidParentness {

    private static Map<Character, Character> match = new HashMap<>();
    private static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();

        match.put(']', '[');
        match.put('}', '{');
        match.put(')', '(');

        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            char c = chars[i];
            if (match.containsKey(c)) {
                if (stack.isEmpty() || !stack.peek().equals(match.get(c))) {
                   return false;
                }
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

//        String z = "){";
//        System.out.println(isValid(z));

        String a = "()";
        System.out.println(isValid(a));

        String b = "()[]{}";
        System.out.println(isValid(b));

        String c = "(]";
        System.out.println(isValid(c));

        String d = "([)]";
        System.out.println(isValid(d));

        String e = "{[]}";
        System.out.println(isValid(e));
    }
}
