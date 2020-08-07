package com.java.althgriom.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-31
 */
public class Sum {

        public static void main(String[] args) {

            String a = "2154365543";
            String b = "4332656442";
            System.out.println(add(a, b));
            // System.out.println("Hello World!");
        }


        private static String add(String a, String b) {

            char[] as = a.toCharArray();
            char[] bs = b.toCharArray();

            int t = 0;
            int aLength = as.length;
            int bLength = bs.length;

            List<Integer> ans = new ArrayList<>();

            if (aLength > bLength) {
                aLength = bLength;
                String temp = a;
                a = b;
                b = temp;
            }

            for (int i=aLength-1; i>=0; i--) {
                int sum = (as[i] - '0') + (bs[i] - '0') + t;
                if (sum < 10) {
                    ans.add(sum);
                    t = 0;
                } else {
                    ans.add(sum % 10);
                    t = sum / 10;
                }
            }

            for (int i = bLength - aLength -1; i>=0; i++) {
                int sum = (bs[i] - '0') + t;
                if (sum < 10) {
                    ans.add(sum);
                    t = 0;
                } else {
                    ans.add(sum % 10);
                    t = sum / 10;
                }
            }

            StringBuilder result = new StringBuilder();

            for (int i = ans.size() - 1; i>=0; i--) {
                result.append(ans.get(i));
            }

            return result.toString();

        }

    }
