package com.java.althgriom.offer;

/**
 * @Description: 写一个函数 StrToInt，实现把字符串转换成整数这个功能。
 * 不能使用 atoi 或者其他类似的库函数。
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class StringToInteger {

    public static int strToInt(String str) {

        char[] strs = str.toCharArray();
        int i = 0;
        Integer ans = 0;

        while (i<strs.length) {
            char c = strs[i];
            if ('0' <= c && '9' >= c) {
                if (ans >= 0) {  // +
                    if (Integer.MAX_VALUE / 10 - ans < (c - '0')) {
                        ans = Integer.MAX_VALUE;
                        break;
                    } else {
                        ans = (ans * 10) + (c - '0');
                    }


                } else {         // -
                    if  ( ans - Integer.MIN_VALUE / 10 < (c - '0')) {
                        ans = Integer.MIN_VALUE;
                        break;
                    } else {
                        ans = (ans * 10) - (c - '0');
                    }
                }
            } else if (ans != 0){ // 后面的字符是非法的
                break;
            }

            if (ans == 0) {
                if (c == '-') {
                    if ( i + 1 < strs.length) {
                        ans = -(strs[++i] - '0');
                    } else {
                        break;
                    }
                } else if ( c == '+') {
                    i++;
                    continue;
                } else if ( c != ' ') {
                    break;
                }
            }


            i++;
        }

        return ans;
    }

    }
