package com.java.althgriom.leetcode.daily;

/**
 * @Description:  在未排序的数组中找到第 k 个最大的元素。
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class FindKthLargest {

    private static int res = Integer.MAX_VALUE;

    public static int findKthLargest(int[] nums, int k) {
        sort(nums, k);
        return res == Integer.MAX_VALUE? nums[0]: res;
    }


    private static void sort(int[] a, int k) {
       sort(a, 0, a.length - 1, k);
    }

    private static void sort(int[] a, int lo, int hi, int k) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        if (j == a.length - k) {
            res = a[j];
            return;
        }
        sort(a, lo, j-1, k);
        sort(a, j+1, hi, k);
    }

    private static int partition(int[] a, int lo, int hi) {

        // 将数组切分为 a[lo, i-1], a[i], a[i+1, hi]
        int i = lo, j = hi+1;
        int v = a[lo];
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

    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean less(int a, int b) {
        return a < b;
    }
}
