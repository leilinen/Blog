package com.java.althgriom.offer;

/**
 * @Description:  输入整数数组 arr ，找出其中最小的 k 个数
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class GetLeastNumbers {

    public static int[] getLeastNumbers(int[] arr, int k) {

        int[] ans = new int[k];
        Integer ansMaxValue = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            int value = arr[i];

            if (value > ansMaxValue) {

                if (i > k - 1) {
                    // 替换数组中存放的最大值，
                    replaceValue(ans, ansMaxValue, value);
                }

                value = ansMaxValue;
            }

            else {
                ans[i] = value;
            }
        }

        return ans;
    }

    private static void replaceValue(int[] arr, int replaceValue, int replacedValue) {

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == replacedValue) {
                arr[i] = replaceValue;
            }
        }
    }
}
