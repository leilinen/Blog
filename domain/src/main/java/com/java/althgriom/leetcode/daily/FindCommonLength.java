package com.java.althgriom.leetcode.daily;

/**
 * @Description: 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * @Author: leiline
 * @CreateTime: 2020-07-01
 */
public class FindCommonLength {

    public static int findLength(int[] A, int[] B) {

        int aLen = A.length;
        int bLen = B.length;
        int lengthCount = 0;

        if (aLen <=0 || bLen <=0) {
            return lengthCount;
        }

        int[][] match = new int[bLen][aLen];

        for (int i=0; i<bLen; i++) {
            for (int j=0; j<aLen; j++) {
                if (B[i] == A[j]) {
                    match[i][j] = 1;
                }
            }
        }


        int i=0, j=0, k=0;
        while (i< bLen) {
            i = 0;
            int colCount = 0;
            for (j = aLen - 1 -k; j <aLen; j++, i++ ) {
                if (match[i][j] == 1) {
                    colCount ++;
                }
            }
            if (colCount > lengthCount) {
                lengthCount = colCount;
            }
            k ++;
        }

        return lengthCount;

    }

    /***
     * 动态代理方法  dp[i][j] = dp[i+1][j+1] + 1
     * @param A
     * @param B
     * @return
     */
    public static int findLength2(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n +1][m+1];

        int ans =0;
        for (int i=n-1; i>=0; i--) {
            for (int j = m-1; j>=0; j--) {
                dp[i][j] = A[i] == B[j]? dp[i+1][j+1] + 1: 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

}
