package com.java.althgriom2022.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 三数之和
 * @Author: leiline
 * @CreateTime: 2022-07-01
 */
public class ThreeNumSum {

    private static List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[i]> nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }

            if (i > 0 &&  nums[i] == nums[i-1]) {
                continue;
            }

            int curr = nums[i];
            int L = i+1;
            int R = nums.length -1;

            while (L < R) {
                int temp = curr + nums[L] + nums[R];
                if (temp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    result.add(list);

                    while (L < R && nums[L+1] == nums[L]) ++L;
                    while (L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if (temp < 0) {
                    ++L;
                } else {
                    --R;
                }

            }
        }

        return result;

    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}
