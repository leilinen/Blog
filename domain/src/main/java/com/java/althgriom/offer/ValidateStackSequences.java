package com.java.althgriom.offer;

import java.util.Stack;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-25
 */
public class ValidateStackSequences {

    private static Stack<Integer> stack = new Stack<>();

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        int pushLength = pushed.length;
        int popedLength = popped.length;
        boolean validate = false;

//        if (pushLength == 0 && popedLength == pushLength) {
//            validate = true;
//            return validate;
//        }

        if (pushLength != popedLength) {
            return validate;
        }

        int i = 0;
        int j = 0;
        while (i < pushLength) {
            stack.push(pushed[i]);
            i++;

            if (stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == popped[j]) {
                stack.pop();
                j++;
            } else {
                break;
            }
        }

        if (stack.isEmpty()) {
            validate = true;
        }

        return validate;

    }
}
