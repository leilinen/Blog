package com.java.althgriom.sort;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class QuickSort2 {

    public static void sort(Integer[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Integer[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }


    private static int partition(Integer[] a, int lo, int hi) {

        // 将数组切分为 a[lo, i-1], a[i], a[i+1, hi]
        int i = lo, j = hi+1;
        Integer v = a[lo];
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

    private static void exch(Integer[] a, int i, int j) {
        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean less(Integer a, Integer b) {
        return a.compareTo(b) < 0;
    }
}
