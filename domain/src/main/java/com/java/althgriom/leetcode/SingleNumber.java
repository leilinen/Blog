package com.java.althgriom.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (count.containsKey(nums[i])) {
                int countValue = count.get(nums[i]);
                countValue ++;
                count.put(nums[i], countValue);
            } else {
                count.put(nums[i], 1);
            }
        }

        Set<Integer> countKey = count.keySet();
        for (Integer key: countKey) {
            if (count.get(key) == 1) {
                return key;
            }
        }

        return 0;

    }
}
