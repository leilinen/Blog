package com.java.althgriom;

import java.util.Scanner;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-10-03
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i=0; i<len; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(getMaxSubArray(array));
    }

    public static int getMaxSubArray(int[] array) {
        int start = array[0];
        int all = array[0];
        for (int i=1; i<array.length; i++) {
            start = Math.max(array[i], start+array[i]);
            all = Math.max(start, all);
        }
        return all;
    }
}
