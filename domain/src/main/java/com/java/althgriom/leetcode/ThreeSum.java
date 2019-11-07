package com.java.althgriom.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && !hasValue(result, nums[i], nums[j], nums[k])) {
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        result.add(integers);
                    }
                }
            }
        }
        return result;
    }

    private static boolean hasValue(List<List<Integer>> lists, int a, int b, int c) {
        for (int i=0; i<lists.size(); i++) {
            List<Integer> list = lists.get(i);
            if (list.contains(a) && list.contains(b) && list.contains(c)) {
                return true;
            }
        }
        return false;
    }

}
