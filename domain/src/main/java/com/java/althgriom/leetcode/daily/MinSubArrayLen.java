package com.java.althgriom.leetcode.daily;

/**
 * @Description: 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class MinSubArrayLen {

    public static int minSubArrayLen(int s, int[] nums) {

        int res = Integer.MAX_VALUE;
        int numsLen = nums.length;

        int sum = 0;

        int i=0, j=0;
        while (j < numsLen) {
            sum += nums[j];
            while (sum >= s) {
                res = Math.min(res, j-i+1);
                sum -= nums[i];
                i++;
            }
            j ++;
        }
        return res == Integer.MAX_VALUE? 0: res;

    }
}
