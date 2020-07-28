package com.java.althgriom.sort;

/**
 * @Description: 快速排序
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class QuickSort {

    public static void sort(String[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(String[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(String[] a, int lo, int hi) {

        // 将数组切分为 a[lo, i-1], a[i], a[i+1, hi]
        int i = lo, j = hi+1;
        String v = a[lo];
        while (true) {
            while (less(a[++i], v)) {  // 从左往右比较
                if (i==hi) {
                    break;
                }
            }

            while (less(v, a[--j])) {  // 从右往左比较
                if (j==lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exch(a, i, j);    // 交换
        }
        exch(a, lo, j);
        return j;
    }

    private static void exch(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean less(String a, String b) {
        return a.compareTo(b) < 0;
    }
}
