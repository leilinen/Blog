package com.java.althgriom.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:  数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * @Author: leiline
 * @CreateTime: 2020-07-05
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> count  = new HashMap<>();
        Integer elementLength = nums.length;

        for (int i=0; i<elementLength; i++) {
            Integer element = nums[i];
            if (count.containsKey(element)) {
                Integer elementCount = count.get(element);
                elementCount++;

                if (elementCount > elementLength / 2) {
                    return element;
                }
                count.put(element, elementCount);
            } else {
               count.put(element, 1);
            }

        }
        return nums[0];
    }
}
