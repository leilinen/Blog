package com.java.althgriom2022;

/**
 * @Description:  青蛙跳台阶问题
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class FrogJump {

    private static int numWays(int n) {
        if (n == 0) {
            return 1;
        } else if (n <= 2) {
            return n;
        } else {
            int a = 1, b = 2;
            int c = 0;
            for (int i=3; i <= n; i++) {
                c = (a + b) % 1000000007;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static void main(String[] args) {

        System.out.println(numWays(2));
        System.out.println(numWays(7));

        System.out.println(numWays(0));
    }
}
