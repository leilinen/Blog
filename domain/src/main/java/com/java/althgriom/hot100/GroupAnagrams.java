package com.java.althgriom.hot100;

import java.util.*;

/**
 * @Description: 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * @Author: leiline
 * @CreateTime: 2020-09-02
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        if (strs.length <=0) {
            return ans;
        }

        Map<String, List<String>> sortedString = new HashMap<>();

        for(String s:strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);

            if (sortedString.containsKey(String.valueOf(ca))) {
                List<String> list = sortedString.get(String.valueOf(ca));
                list.add(s);
                sortedString.put(String.valueOf(ca), list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                sortedString.put(String.valueOf(ca), list);
            }

        }

        Set<String> keys = sortedString.keySet();
        for (String key: keys) {
            ans.add(sortedString.get(key));
        }


        return ans;
    }


}
