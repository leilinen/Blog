package com.java.althgriom2022;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class Fibnacci {

    public static int fib(int n) {

        if (n == 0) return  0;
        if (n == 1) return 1;
        return fib(n-2) + fib(n-1);

    }

    public static int fib2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0, b = 1;
            int c = 0;
            for (int i = 2; i<=n; i++) {
                c = (a + b)%1000000007;
                a = b;
                b = c;
            }
            return c;
        }


    }

    public static void main(String[] args) {

       // System.out.println(fib2(2));

        System.out.println(fib2(45));
    }
}
