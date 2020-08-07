package com.java.althgriom.offer;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-05
 */
public class FindSingleChar {

    public char firstUniqChar(String s) {

        if (s == null || s == "") {
            return ' ';
        }

        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new LinkedHashMap<>();

        for (int i=0; i<chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                map.put(c, true);
            } else {
                map.put(c, false);
            }
        }

        Iterator<Map.Entry<Character, Boolean>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry<Character, Boolean> entry = iterator.next();
             if (entry.getValue() == false) {
                 return entry.getKey();
             }
        }
        return ' ';
    }
}
