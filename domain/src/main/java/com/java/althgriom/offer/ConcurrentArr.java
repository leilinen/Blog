package com.java.althgriom.offer;

/**
 * @Description:  从A[0]乘到A[n-1]，其中不乘和B下标相同的
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class ConcurrentArr {

    public static int[] concurrentArr(int[] a) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) { //启动值
                int j = i + 1;
                int result = a[j];
                j++;
                while (j<a.length) {
                    result = result * a[j];
                    j++;
                }
                ans[i] = result;
            } else {
                if (ans[i -1] == 0) {
                    int j = 0;
                    int result = a[j];
                    j++;
                    while (j < a.length) {
                        if (i != j) {
                            result = result * a[j];
                        }
                        j++;
                    }
                    ans[i] = result;
                } else {
                    if (a[i] != 0) {
                        ans[i] = (ans[i - 1] * a[i - 1] / a[i]);
                    } else {
                        ans[i] = 0;
                    }
                }
            }
        }
        return ans;
    }

}
